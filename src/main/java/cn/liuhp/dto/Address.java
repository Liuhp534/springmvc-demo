package cn.liuhp.dto;

import lombok.Data;

import java.util.List;

/**
 * Description:
 * @Author: 01399178
 * Date: 2020/8/12 15:13
 */
@Data
public class Address {

    private String phone;

    private String province;

    private List<String>  emails;

}
