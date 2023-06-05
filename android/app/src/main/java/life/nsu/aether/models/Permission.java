/*
 * Permission Created by Samiur Prapon
 * Last modified  11/18/22, 11:29 PM
 * Copyright (c) 2022. All rights reserved.
 *
 */

package life.nsu.aether.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Permission {
    @SerializedName("id")
    @Expose()
    private String id;

    @SerializedName("type")
    @Expose()
    private String type;

    @SerializedName("level")
    @Expose()
    private String level;

    public Permission(String id, String type, String level) {
        this.id = id;
        this.type = type;
        this.level = level;
    }

    public Permission() {
        // empty constructor for Retrofit
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getLevel() {
        return level;
    }
}
