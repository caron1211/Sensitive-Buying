package com.example.sensitivebuying.dataObject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.Serializable;

public class Sensitive implements Serializable {

    private String sensitiveKey;
    private String sensitiveType;

    public Sensitive()
    {
    }

    public Sensitive(String sensitiveType, String sensitiveKey)
    {
        this.sensitiveType = sensitiveType;
        this.sensitiveKey=sensitiveKey;
    }

    public String getsensitiveKey() {
        return sensitiveKey;
    }

    public void setsensitiveKey(String sensitiveKey) {
        this.sensitiveKey = sensitiveKey;
    }

    public String getSensitiveType()
    {
        return sensitiveType;
    }

    public void setSensitiveType(String sensitiveType) {
        this.sensitiveType = sensitiveType;
    }


    @NonNull
    @Override
    public String toString() {
        return sensitiveType;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        // If the object is compared with itself then return true
        if (obj == this) {
            return true;
        }
        Sensitive s = (Sensitive) obj;

        if (this.sensitiveType.equals(s.sensitiveType)){
            return true;
        }


        return false;
    }


}
