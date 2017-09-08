package cn.sepiggy.service;

import cn.sepiggy.common.ServerResponse;
import cn.sepiggy.pojo.User;

public interface IUserService {

    ServerResponse<User> login(String username, String password);

    ServerResponse<String> register(User user);

    ServerResponse<String> checkValid(String str, String type);
}
