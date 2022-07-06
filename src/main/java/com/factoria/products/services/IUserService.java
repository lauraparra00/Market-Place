package com.factoria.products.services;

import com.factoria.products.models.User;

public interface IUserService {
    User getById(Long id);
}
