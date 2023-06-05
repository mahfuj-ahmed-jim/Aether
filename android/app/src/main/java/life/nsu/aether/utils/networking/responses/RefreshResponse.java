/*
 * LoginResponse Created by Samiur Prapon
 * Last modified  6/1/21 7:42 AM
 * Copyright (c) 2021. All rights reserved.
 *
 */

package life.nsu.aether.utils.networking.responses;

import androidx.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import life.nsu.aether.models.Tokens;

public class RefreshResponse {

    @SerializedName("isError")
    @Expose()
    private boolean isError;

    @SerializedName("message")
    @Expose()
    private String message;

    @SerializedName("accessToken")
    @Expose()
    private String accessToken;

    public RefreshResponse() {
        // empty constructor for Retrofit
    }

    public RefreshResponse(String message, String accessToken) {
        this.message = message;
        this.accessToken = accessToken;
    }

    public boolean isError() {
        return isError;
    }

    public void setError(boolean error) {
        isError = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
