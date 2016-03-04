//------------------------------------------------------------------------------
// User.java
//------------------------------------------------------------------------------
// Copyright (c) 2001-2016 Subex Limited.  All rights reserved.
//
// Please refer to $/Copyright.txt for notices regarding the confidential and
// proprietary nature of this source code.
//------------------------------------------------------------------------------

package com.hemanth;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * User
 * @since 7.4
 * @author hemanth.v
 */
@XmlRootElement(name = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;

    private String name;

    private String profession;

    /**
     * Constructor for User.java
     */
    public User() {
    }

    /**
     * Constructor for User.java
     * @param id
     * @param name
     * @param profession
     */
    public User(int id, String name, String profession) {
        this.id = id;
        this.name = name;
        this.profession = profession;
    }

    /**
     * getId
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * setId
     * @param id
     */
    @XmlElement
    public void setId(int id) {
        this.id = id;
    }

    /**
     * getName
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * setName
     * @param name
     */
    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getProfession
     * @return profession
     */
    public String getProfession() {
        return profession;
    }

    /**
     * setProfession
     * @param profession
     */
    @XmlElement
    public void setProfession(String profession) {
        this.profession = profession;
    }
}
