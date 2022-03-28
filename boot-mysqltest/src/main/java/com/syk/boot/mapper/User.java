package com.syk.boot.mapper;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName t_user
 */
@Data
public class User implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String wxOpenid;

    /**
     * 
     */
    private String phone;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private String nickname;

    /**
     * 
     */
    private String avatar;

    /**
     * 
     */
    private Integer gender;

    /**
     * 
     */
    private Date birthday;

    /**
     * 
     */
    private String address;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private String banner;

    private static final long serialVersionUID = 1L;
}