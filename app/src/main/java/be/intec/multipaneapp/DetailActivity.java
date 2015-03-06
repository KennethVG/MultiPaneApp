package be.intec.multipaneapp;

import android.content.res.Configuration;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import be.intec.multipaneapp.fragments.FragmentDetail;


public class DetailActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            finish();
            return;
        }
        setContentView(R.layout.activity_detail);

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            String person = extras.getString("person");
            FragmentDetail detail = (FragmentDetail) getFragmentManager().
                    findFragmentById(R.id.fragment_detail_port);
            detail.setText(person);
        }
    }
}
