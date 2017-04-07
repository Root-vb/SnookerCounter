package com.example.android.snookercounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int curr_ScoreA=0,curr_ScoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Restart(View view)
    {
        setContentView(R.layout.activity_main);
        curr_ScoreA=0;
        curr_ScoreB=0;
    }
    public void EndGame(View view)
    {
        setContentView(R.layout.winner);
        if(curr_ScoreA>curr_ScoreB)
        {
            TextView scoreView1 = (TextView)findViewById(R.id.winner);
            scoreView1.setText("Team A");
            TextView scoreView2 = (TextView)findViewById(R.id.winnerScore);
            scoreView2.setText(String.valueOf(curr_ScoreA));
            TextView scoreView3 = (TextView)findViewById(R.id.loser);
            scoreView3.setText("Team B");
            TextView scoreView4 = (TextView)findViewById(R.id.loserScore);
            scoreView4.setText(String.valueOf(curr_ScoreB));
        }
        else if(curr_ScoreA<curr_ScoreB)
        {
            TextView scoreView1 = (TextView)findViewById(R.id.loser);
            scoreView1.setText("Team A");
            TextView scoreView2 = (TextView)findViewById(R.id.loserScore);
            scoreView2.setText(String.valueOf(curr_ScoreA));
            TextView scoreView3 = (TextView)findViewById(R.id.winner);
            scoreView3.setText("Team B");
            TextView scoreView4 = (TextView)findViewById(R.id.winnerScore);
            scoreView4.setText(String.valueOf(curr_ScoreB));
        }
        else
        {
            TextView scoreView1 = (TextView)findViewById(R.id.winner);
            scoreView1.setText("No One");
            TextView scoreView2 = (TextView)findViewById(R.id.winnerScore);
            scoreView2.setText("WINS");
            TextView scoreView3 = (TextView)findViewById(R.id.loser);
            scoreView3.setText("The");
            TextView scoreView4 = (TextView)findViewById(R.id.loserScore);
            scoreView4.setText("Game");
        }
    }
    public void RST(View view)
    {
        curr_ScoreA=0;
        curr_ScoreB=0;
        displayForTeamB(curr_ScoreB);
        displayForTeamA(curr_ScoreA);
    }
    public void plus2(View view)
    {
        if(view.getId()== R.id.Button2B)
        {
            curr_ScoreB+=2;
            displayForTeamB(curr_ScoreB);
        }
        else
        {
            curr_ScoreA += 2;
            displayForTeamA(curr_ScoreA);
        }
    }
    public void plus3(View view)
    {
        if(view.getId()== R.id.Button3B)
        {
            curr_ScoreB+=3;
            displayForTeamB(curr_ScoreB);
        }
        else
        {
            curr_ScoreA += 3;
            displayForTeamA(curr_ScoreA);
        }
    }

    public void plus4(View view)
    {
        if(view.getId()== R.id.Button4B)
        {
            curr_ScoreB+=4;
            displayForTeamB(curr_ScoreB);
        }
        else
        {
            curr_ScoreA += 4;
            displayForTeamA(curr_ScoreA);
        }
    }
    public void plus5(View view)
    {
        if(view.getId()== R.id.Button5B)
        {
            curr_ScoreB+=5;
            displayForTeamB(curr_ScoreB);
        }
        else
        {
            curr_ScoreA += 5;
            displayForTeamA(curr_ScoreA);
        }
    }
    public void plus6(View view)
    {
        if(view.getId()== R.id.Button6B)
        {
            curr_ScoreB+=6;
            displayForTeamB(curr_ScoreB);
        }
        else
        {
            curr_ScoreA += 6;
            displayForTeamA(curr_ScoreA);
        }
    }
    public void plus7(View view)
    {
        if(view.getId()== R.id.Button7B)
        {
            curr_ScoreB+=7;
            displayForTeamB(curr_ScoreB);
        }
        else
        {
            curr_ScoreA += 7;
            displayForTeamA(curr_ScoreA);
        }
    }
    public void plus10(View view)
    {
        if(view.getId()== R.id.Button10B)
        {
            curr_ScoreB+=10;
            displayForTeamB(curr_ScoreB);
        }
        else
        {
            curr_ScoreA += 10;
            displayForTeamA(curr_ScoreA);
        }
    }
    public void minus1(View view)
    {
        if(view.getId()== R.id.ButtonN1B)
        {
            curr_ScoreB-=1;
            displayForTeamB(curr_ScoreB);
        }
        else
        {
            curr_ScoreA -= 1;
            displayForTeamA(curr_ScoreA);
        }
    }
    public void displayForTeamA(int score)
    {
        TextView scoreView = (TextView)findViewById(R.id.teamAScore);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score)
    {
        TextView scoreView = (TextView)findViewById(R.id.teamBScore);
        scoreView.setText(String.valueOf(score));
    }
}

