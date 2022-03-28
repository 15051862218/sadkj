package com.syk.boot.task;


import com.syk.boot.entit.Article;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

/**
 * @Author 沈永康
 * @Date 2022/3/28 15:59
 * @Version 1.0
 */

@Component
@Slf4j
public class ArticleTask implements Callable<List<Article>> {
    private  static  final String BASE_URL = "https://godweiyang.com";
    private List<Article> articleList;

    @Override
    public List<Article> call() throws Exception {
        articleList = new ArrayList<>(100);
        Document document = null;
        //定义页码
        int index;
        for (index =2;index < 5; index++){
         document= (Document) Jsoup.connect(BASE_URL+ "/page/" +index).get();
            Elements cards = document.getElementsByClass("card");
    parseCards(cards);
        }

        return articleList;
    }
    private void parseCards(Elements cards){
        for (Element card : cards){
            Element element = card.select(".card-title").get(0);
            String title = element.text();
            System.out.println(title);
            Element imgNode = card.select(".responsive-img").get(0);
            String cover =BASE_URL + imgNode.attr("src");
            System.out.println(cover);
            Element categoryNode = card.select(".post-category").get(0);
            String category = categoryNode.html();
            System.out.println(category);
            String url =BASE_URL + categoryNode.attr("href");

            Random random = new Random();
            int userId = random.nextInt(5)+1;
            Element summaryNode =card.select(".summary").get(0);
            String summary = categoryNode.html();

            Article article =Article.builder()
                    .title(title)
                    .cover(cover)
                    .category(category)
                    .url(url)
                    .userId(userId)
                    .summary(summary)
                    .build();
            articleList.add(article);

        }

    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ArticleTask at = new ArticleTask();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<List<Article>> future = executor.submit(at);
        List<Article> articles = future.get();
        articles.forEach(article -> System.out.println(article.getTitle()+"," +article.getCover()));
    }
}
