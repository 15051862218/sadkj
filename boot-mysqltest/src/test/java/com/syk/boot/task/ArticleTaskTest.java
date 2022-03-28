package com.syk.boot.task;

import com.syk.boot.entit.Article;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import java.util.List;
import java.util.concurrent.*;


/**
 * @Author 沈永康
 * @Date 2022/3/28 16:46
 * @Version 1.0
 */

@SpringBootTest
@ExtendWith(SpringExtension.class)
class ArticleTaskTest {
   @Resource
   private ArticleTask articleTask;
    @Test
    void getArticles() throws ExecutionException, InterruptedException {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(4, 8, 5, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        Future<List<Article>> future = executor.submit(articleTask);
        List<Article> articles = future.get();
        System.out.println(articles);

    }


}