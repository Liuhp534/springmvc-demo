package cn.liuhp.util;

import cn.liuhp.dto.Address;
import cn.liuhp.dto.User;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description: spring copy工具类型
 * @Author: 01399178
 * Date: 2020/8/12 15:10
 */
public class SpringCopyUtils {

    public static void main(String[] args) {
        fun1();
    }


    private static void fun1() {
        User user = new User();
        List<Address> addressList = new ArrayList<>();
        Address address1 = new Address();
        address1.setPhone("phone1");
        address1.setProvince("province1");
        address1.setEmails(Arrays.asList("1", "2"));
        Address address2 = new Address();
        address2.setPhone("phone2");
        address2.setProvince("province2");
        address2.setEmails(Arrays.asList("4", "3"));

        addressList.add(address1);
        addressList.add(address2);

        user.setAddress(addressList);
        user.setUserName("liuhp");

        User copyUser = new User();
        BeanUtils.copyProperties(user, copyUser);
        long start = System.currentTimeMillis();
        for (int i=0; i < 1; i ++) {
            copyUser = new User();
            BeanUtils.copyProperties(user, copyUser);
        }
        System.out.println(System.currentTimeMillis() - start);

        //System.out.println("源头=" + user);
        //System.out.println("复制=" + copyUser);
    }





}
