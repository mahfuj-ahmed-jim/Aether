/*
 * UserCredential Created by Samiur Prapon
 * Last modified  6/1/21 5:51 AM
 * Copyright (c) 2021. All rights reserved.
 *
 */

package life.nsu.aether.models;

import androidx.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("id")
    @Expose()
    private String id;

    @SerializedName("email")
    @Expose()
    private String email;

    @SerializedName("school")
    @Expose()
    private String school;

    @SerializedName("name")
    @Expose()
    private String name;

    @SerializedName("school")
    @Expose()
    private String school;

    public User() {
        // empty constructor for Retrofit
    }


    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public User(String id, String email, String name, String school) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
    }

    @NonNull
    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
