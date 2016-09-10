package cn.aurora_x.android.mediaplayer;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    TextView textLoopState;
    Button buttonStart;
    Button buttonPause;
    Button buttonStop;
    Button buttonLoop;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = new MediaPlayer();
        textLoopState = (TextView) findViewById(R.id.tv_loop_status);
        buttonStart = (Button) findViewById(R.id.btn_start);
        buttonPause = (Button) findViewById(R.id.btn_pause);
        buttonStop = (Button) findViewById(R.id.btn_stop);
        buttonLoop = (Button) findViewById(R.id.btn_loop);
        buttonPause.setEnabled(false);
        buttonStop.setEnabled(false);
    }

    public void onStartClicked(View view) {
        mediaPlayer.reset();
        AssetManager assetManager = getAssets();
        try {
            AssetFileDescriptor assetFileDescriptor = assetManager.openFd("music.mp3");
            mediaPlayer.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
            mediaPlayer.prepare();
            mediaPlayer.start();
            buttonPause.setEnabled(true);
            buttonStop.setEnabled(true);
            buttonStart.setEnabled(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onPauseClicked(View view) {
        if (mediaPlayer.isPlaying()) {
            buttonPause.setText("Play");
            mediaPlayer.pause();
        } else {
            buttonPause.setText("Pause");
            mediaPlayer.start();
        }
    }

    public void onStopClicked(View view) {
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
            buttonStart.setEnabled(true);
            buttonPause.setEnabled(false);
            buttonStop.setEnabled(false);
        }
    }

    public void onLoopClicked(View view) {
        boolean isLoop = mediaPlayer.isLooping();
        mediaPlayer.setLooping(!isLoop);
        if (isLoop) {
            textLoopState.setText("Loop on");
        } else {
            textLoopState.setText("Loop off");
        }
    }
}
