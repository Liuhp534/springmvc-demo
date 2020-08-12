package cn.liuhp.dto;

import lombok.Data;

import java.util.List;

/**
 * Description:
 * @Author: 01399178
 * Date: 2020/8/12 15:11
 */
@Data
public class User {

    private String userName;

    private List<Address> address;

}
