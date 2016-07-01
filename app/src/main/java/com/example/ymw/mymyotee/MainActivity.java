package com.example.ymw.mymyotee;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    private  String savefeed;
    private boolean isVoice = true;
    private int img1count = 0;
    private int img2count = 0;
    private int img3count = 0;
    private int img4count = 0;
    private int img5count = 0;
    private int img6count = 0;
    private int img7count = 0;
    private int img8count = 0;
    private int[] firstimgbutton = new int[] {
            R.drawable.bt_homepage_sound_on,
            R.drawable.bt_homepage_sound_off,
    };
    private int[] secondimgbutton = new int[] {
            R.drawable.bt_homepage_share_up,
            R.drawable.bt_homepage_share_down,
    };
    private int[] thirdimgbutton = new int[] {
            R.drawable.bt_yijianfankui_up,
            R.drawable.bt_yijianfankui_down,
    };
    private int[] fourthimgbutton = new int[] {
            R.drawable.bt_man_up,
            R.drawable.bt_man_down,
    };
    private int[] fifthimgbutton = new int[] {
            R.drawable.bt_woman_up,
            R.drawable.bt_woman_down,
    };
    private int[] sixthimgbutton = new int[] {
           R.drawable.bt_double_up,
            R.drawable.bt_double_down,
    };
    private int[] seventhimgbutton = new int[] {
            R.drawable.bt_history_up,
            R.drawable.bt_history_down,
    };
    private int[] eighthimgbutton = new int[] {
            R.drawable.pic_newproduct,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final  ImageButton imgbutton1 = (ImageButton) findViewById(R.id.imagebutton1);
        imgbutton1.setImageResource(firstimgbutton[0]);
        imgbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgbutton1.setImageResource(firstimgbutton[++img1count%firstimgbutton.length]);
                if (isVoice) {
                    isVoice = false;
                } else {
                    isVoice = true;
                }
            }
        });
        final ImageButton imgbutton2 = (ImageButton) findViewById(R.id.imagebutton2);
        imgbutton2.setImageResource(secondimgbutton[0]);
        imgbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgbutton2.setImageResource(secondimgbutton[++img2count % secondimgbutton.length]);
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            }
        });
        final ImageButton imgbutton3 = (ImageButton) findViewById(R.id.imagebutton3);
        imgbutton3.setImageResource(thirdimgbutton[0]);
        imgbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgbutton3.setImageResource(thirdimgbutton[++img3count % thirdimgbutton.length]);
                Intent intent = new Intent(MainActivity.this,AdviceFeedbackActivity.class);
                startActivity(intent);
            }
        });
        final ImageView imgview1 = (ImageView) findViewById(R.id.imageView1);
        imgview1.setImageResource(R.drawable.pic_startpage_logo_faceq);
        final ImageButton imgbutton4 = (ImageButton) findViewById(R.id.imagebutton4);
        imgbutton4.setImageResource(fourthimgbutton[0]);
        imgbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgbutton4.setImageResource(fourthimgbutton[++img4count % fourthimgbutton.length]);
                if (isVoice) {
                    MediaPlayer mPlayer = MediaPlayer.create(MainActivity.this, R.raw.boy);
                    mPlayer.start();
                }
                Intent intent = new Intent(MainActivity.this,ManActivity.class);
                startActivity(intent);
            }
        });
        final ImageButton imgbutton5 = (ImageButton) findViewById(R.id.imagebutton5);
        imgbutton5.setImageResource(fifthimgbutton[0]);
        imgbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgbutton5.setImageResource(fifthimgbutton[++img5count%fifthimgbutton.length]);
                if (isVoice) {
                    MediaPlayer mPlayer = MediaPlayer.create(MainActivity.this,R.raw.girl);
                    mPlayer.start();
                }
                Intent intent = new Intent(MainActivity.this,WomanActivity.class);
                startActivity(intent);
            }
        });
        final ImageButton imgbutton6 = (ImageButton) findViewById(R.id.imagebutton6);
        imgbutton6.setImageResource(sixthimgbutton[0]);
        imgbutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgbutton6.setImageResource(sixthimgbutton[++img6count%sixthimgbutton.length]);
                Intent intent = new Intent(MainActivity.this,DoubleModelActivity.class);
                startActivity(intent);
            }
        });
        final ImageButton imgbutton7 = (ImageButton) findViewById(R.id.imagebutton7);
        imgbutton7.setImageResource(seventhimgbutton[0]);
        imgbutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgbutton7.setImageResource(seventhimgbutton[++img7count % seventhimgbutton.length]);
            }
        });
        final ImageButton imgbutton8 = (ImageButton) findViewById(R.id.imagebutton8);
        imgbutton8.setImageResource(eighthimgbutton[0]);
        final ImageButton imgbutton9 = (ImageButton) findViewById(R.id.imagebutton9);
        imgbutton9.setImageResource(R.drawable.pic_startpage_joinus);
        imgbutton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,JoinUsActivity.class);
                startActivity(intent);
            }
        });
        final ImageView imgview2 = (ImageView) findViewById(R.id.imageView2);
        imgview2.setImageResource(R.drawable.pic_startpage_aboutus);
        final ImageButton imgbutton10 = (ImageButton) findViewById(R.id.imagebutton10);
        imgbutton10.setImageResource(R.drawable.pic_startpage_team);
        imgbutton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TeamIntroduceActivity.class);
                startActivity(intent);
            }
        });
        final ImageView imgview3 = (ImageView) findViewById(R.id.imageView3);
        imgview3.setImageResource(R.drawable.pic_copyright);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
