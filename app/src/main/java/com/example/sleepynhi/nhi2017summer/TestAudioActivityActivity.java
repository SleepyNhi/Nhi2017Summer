package com.example.sleepynhi.nhi2017summer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sleepynhi.nhi2017summer.controller.TestAudioController;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TestAudioActivityActivity extends BaseActivity {

    private TestAudioController controller;
    private String audioURL = "http://other.web.rh01.sycdn.kuwo.cn/resource/n3/77/1/1061700123.mp3";
    @BindView(R.id.activity_testaudio_play)
    Button playBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_audio_activity);
        ButterKnife.bind(this);
        controller = new TestAudioController(this, new TestAudioController.AudioListener() {
            @Override
            public void onPlaying() {
                playBt.setText("Pause");
                playBt.setClickable(true);
            }

            @Override
            public void onLoading() {
                playBt.setText("Loading..");
                playBt.setClickable(false);
            }

            @Override
            public void onPaused() {
                playBt.setText("Play");
                playBt.setClickable(true);
            }
        });

        playBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (TestAudioController.STATUS){
                    case TestAudioController.AUDIOPlaying:
                        controller.pause();
                        break;
                    case TestAudioController.AUDIOPause:
                        controller.play(audioURL);
                        break;
                    default:
                        break;
                }


            }
        });
    }
}
