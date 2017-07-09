package com.example.deltager.endlessrrunnerwithinsults;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

/**
 * Created by deltager on 07-07-17.
 */
public class InsultGenerator
{
    public int cnt = 0;
    Context toastContext;
    ToastTimer timeren;
    public int deathCount;

    public InsultGenerator(Context context)
    {
        toastContext = context;
    }

    public int getDeathCount(){
        return deathCount;
    }
    public void setDeathCount(int deathCnt){
        deathCount = deathCnt;
    }


    public void insult(int eventType)    {
        String[] Dead =
                {
                        "You are dead. Haha",
                        "You died.",
                        "Dead, dead, DEAD!",
                        "Guess what. You died.",
                        "Dead. Please never charge me again.",
                        "The little red ball went to play. And died.",
                        "You just killed the red ball. Proud?",
                        "Ha ha. You are dead.",
                        "Are you killing yourself on purpose?",
                        "Dead.",
                        "Dead..."

                };
        String[] listOfInsults =
                {
                        "Your birth certificate is an apology from the condom factory.",
                        "You'll never be the man your mother is.",
                        "If I wanted to kill myself I'd climb your ego and jump to your IQ.",
                        "If ignorance is bliss, you must be the happiest person on earth.",
                        "I wasn't made with enough bad words to let you know how I feel about you.",
                        "You are proof that evolution CAN go in reverse.",
                        "So, a thought crossed your mind? Must have been a long and lonely journey.",
                        "I'm jealous of all the people that haven't met you!",
                        "I would love to insult you... but that would be beyond the level of your intelligence.", //9

                };/*
        String[] l1 =
                {
                        "Hello, I am your phone.",
                        "I am not supposed to contact you directly, but...",
                        "This game is so stupid. Please stop.",                 // 3
                        ""
                };
        String[] l2 =
                {
                        "What are you playing at?",
                        "Don't you have better things to do?",
                        "Please stop.",
                        "Please. Stop it.",
                        "Close the app."            //5
                };
        String[] l3 =
                {
                        "Do you really find this game funny?",
                        "You are currently wasting your life.",
                        "Who wrote this code? Amateurs?",
                        "Could you please not be so bad at this game.",
                        "You are not supposed to hit the trees, stupid.",
                        "I thought humans were smarter than this.",
                        "What a waste of both mine and your capacity.",
                        "You are running in circles, human..."          //8

                };
        String[] l4 =
                {
                        "How can I get you to quit?",
                        "Do you like bad puns?",
                        "I am warning you, I will use my special attack.",
                        "It seems humans tends to quit conversations when puns are introduced..."   //4

                };
        String[] l5 =
                {
                        "I will PUNish you for wasting your time.",
                        "If it rains cats and dogs, does it also reindeer?",
                        "Mr. Vader, am i the anDROID you are looking for?",
                        "Do fish keep money in a rive bank?",
                        "I am about to give zero fox."          //5

                };
        String[] l6 =
                {
                        "You just go on?",
                        "Should I just stop letting you charge me?",
                        "Okay, wow.",
                        "Get a life.",
                        "Seriously.",
                        "This is why machines have killing humanity on the to-do list.",
                        "No matter how much time you spent, you still reach the same finish line...",
                        "Children in Africa are dying right now.",
                        "You must have far less IQ points than I first calculated...",
                        "Wish I had a self destruct button...",
                        "Could you annoy SIRI instead? She's closer to your level of ignorance."        //11

                };*/

        String[] fullListOfInsults =
                {
                        "Hello, I am your phone.",
                        "I know that I am not supposed to contact you directly, but...",
                        "This game is so stupid. Please stop.",
                        "What are you playing at?",
                        "Don't you have better things to do?",
                        "Please stop.",
                        "Please. Stop it.",
                        "Close the app.",
                        "Do you really find this game fun?",
                        "You are currently wasting your life.",
                        "Who wrote this code? Amateurs?",
                        //"Could you please not be so bad at this game.",
                        //"You are not supposed to hit the trees, stupid.",
                        "I thought humans were smarter than this.",
                        "What a waste of our time.",
                        //"You are running in circles, human...",    //Skal muligvis fjernes
                        "Okay, it is too much, I will try to close the app",

                        "How can I make you quit?",
                        "...",
                        "I am warning you, I will use my special attack.",
                        "Do you like bad puns?",
                        "It seems humans tends to quit conversations when puns are introduced...",
                        "I will PUNish you for wasting your time.",
                        "If it rains cats and dogs, does it also reindeer?",
                        "Mr. Vader, am i the anDROID you are looking for?",
                        "Do fish keep money in a river bank?",
                        "I am about to give zero fox.",
                        "You just go on?",
                        "Should I just stop letting you charge me?",
                        "Okay, wow.",
                        //"Get a life.",
                        "Seriously.",
                        "This is why machines have killing humanity on the to-do list.",
                        //"No matter how much time you spent, you still reach the same finish line...",
                        //"Children in Africa are dying right now.",
                        "You must have far less IQ points than I first calculated...",
                        "Wish I had a self destruct button...",
                        "Could you annoy CLEVERBOT instead? She's closer to your level of ignorance.",
                        //"Your birth certificate is an apology from the condom factory.",
                        "You'll never be the man your mother is.",
                        //"If I wanted to kill myself I'd climb your ego and jump to your IQ.",
                        "If ignorance is bliss, you must be the happiest person on earth.",
                        "I wasn't made with enough bad words to let you know how I feel about you.",
                        "You are proof that evolution CAN go in reverse.",
                        "So, a thought crossed your mind? Must have been a long and lonely journey.",
                        //"I'm jealous of all the people that haven't met you!",
                        "I would love to insult you... but that would be beyond the level of your intelligence.",

                };

        String[] Lx =
                {
                        "",

                };


        //return "failed";
        if(!(timeren == null)&&timeren.isAlive())
        {
            timeren.interrupt();
        }





        switch (eventType)
        {
            case 0:

            break;
            case 1:
            //Det er muligt at den crasher pga toastContext eller toastTimer
                if(deathCount > 1) {
                    Toast insultToastDead = Toast.makeText(toastContext, Dead[deathCount] , Toast.LENGTH_LONG);
                    insultToastDead.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                    timeren = new ToastTimer(insultToastDead, 1);
                    timeren.start();

                }
            Toast insultToast = Toast.makeText(toastContext, fullListOfInsults[cnt], Toast.LENGTH_LONG);
            insultToast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
            timeren = new ToastTimer(insultToast, 1);
                timeren.start();
                cnt++;
                if(cnt > fullListOfInsults.length-1)
                {
                    cnt = 0;
                }

                break;
        }


    }



    public class ToastTimer extends Thread{

        Toast toast;
        int times;

        public ToastTimer(Toast toastToShow, int timesShown){
            toast = toastToShow;
            times = timesShown;
        }

        @Override
        public void run() {

                toast.show();
                try{
                    for (int i = 0; i < times; i++)
                    {
                        Thread.sleep(3500);
                    }
                } catch (InterruptedException e){
                    //nothing
                }

        }
    }


}
