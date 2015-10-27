package io.github.ashleysullins.twitterclone.UI;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import io.github.ashleysullins.twitterclone.R;
import io.github.ashleysullins.twitterclone.models.User;

public class MainActivity extends ListActivity {

    private SharedPreferences mPreferences;
    private User mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPreferences = getApplicationContext().getSharedPreferences("twitter", Context.MODE_PRIVATE);

        if (!isRegistered()) {
            Intent intent = new Intent(this, RegisterActivity.class);
            startActivity(intent);
        }
    }

    private boolean isRegistered() {
        String username = mPreferences.getString("username", null);
        if (username == null) {
            return false;
        } else {
            return true;
        }
    }
}
