package com.example.webservice.services;


import com.example.webservice.entities.Role;
import com.example.webservice.exceptions.forbidden.ForbiddenException;
import com.example.webservice.exceptions.notfound.UserNotFoundException;

import java.util.List;

public interface RoleService {
    Role findRole(Role.ERole role);
    Role findByRole(String role);
    Role save(Role role);

    List<Role> findByUser(Long userId) throws ForbiddenException, UserNotFoundException;
}
