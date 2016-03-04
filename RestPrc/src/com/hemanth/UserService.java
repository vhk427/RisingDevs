//------------------------------------------------------------------------------
// UserService.java
//------------------------------------------------------------------------------
// Copyright (c) 2001-2016 Subex Limited.  All rights reserved.
//
// Please refer to $/Copyright.txt for notices regarding the confidential and
// proprietary nature of this source code.
//------------------------------------------------------------------------------

package com.hemanth;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * UserService
 * @since 7.4
 * @author hemanth.v
 */

@Path("/us")
public class UserService {

    UserDao userDao = new UserDao();

    /**
     * getUsers
     * @return list
     */
    @GET
    @Path("/usr")
    @Produces(MediaType.APPLICATION_XML)
    public List<User> getUsers() {
        return userDao.getAllUsers();
    }
}
