package io.github.ashleysullins.twitterclone.models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by ashleysullins on 10/26/15.
 */
@Table(name = "Users", id = "_id")
public class User extends Model{

    @Column(name = "Name")
    private String mName;

    public User() {
        super();
    }

    public User(String name) {
        super();
        mName = name;
    }

    public String getName() {
        return mName;
    }
}
