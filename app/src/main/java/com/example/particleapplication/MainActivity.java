package com.example.particleapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;

import io.particle.android.sdk.cloud.ParticleCloudSDK;
import io.particle.android.sdk.cloud.ParticleDevice;
import io.particle.android.sdk.cloud.exceptions.ParticleCloudException;
import io.particle.android.sdk.cloud.exceptions.ParticleLoginException;
import io.particle.android.sdk.utils.Async;
import io.particle.android.sdk.utils.Toaster;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ParticleCloudSDK.init(this);
        setContentView(R.layout.activity_main);
        textview = findViewById(R.id.add_mpg);

        //adding comment for github

        //Adding comment for trying to branch using github.

        /*
        ParticleDevice myDevice = null;
        try {
            myDevice = ParticleCloudSDK.getCloud().getDevice("e00fce684e8083453f49b051");
        } catch (ParticleCloudException e) {
            e.printStackTrace();
        }

        String nameString = myDevice.getName();
        textview.setText(nameString);

        /*
        Async.executeAsync(myDevice, new Async.ApiWork<ParticleDevice, Integer>() {

            public Integer callApi(ParticleDevice particleDevice)
                    throws ParticleCloudException, IOException {
                try {
                    return (Integer) particleDevice.getVariable("myVariable");
                } catch (ParticleDevice.VariableDoesNotExistException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onSuccess(Integer value) {
                Toaster.s(MainActivity.this, "Room light is " + value + " degrees.");
            }

            @Override
            public void onFailure(ParticleCloudException e) {
                Log.e("some tag", "Something went wrong making an SDK call: ", e);
                Toaster.l(MainActivity.this, "Uh oh, something went wrong.");
            }
        });

        try {
            int anInteger = myDevice.getIntVariable("someIntValue");
        } catch (ParticleCloudException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParticleDevice.VariableDoesNotExistException e) {
            e.printStackTrace();
        }

         */
    }
}