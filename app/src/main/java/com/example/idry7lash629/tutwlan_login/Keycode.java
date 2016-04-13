package com.example.idry7lash629.tutwlan_login;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import android.view.KeyEvent;

public class Keycode {
	public static void Stringからキーイベント発行(MainActivity mv,String 文字列)
	{
		char[] char配列= 文字列.toCharArray();
		for(int i=0;i<char配列.length;i++)
			Char型をキーイベント発行(mv,char配列[i]);
	}
	@SuppressLint("InlinedApi") private static void Char型をキーイベント発行(MainActivity mv,char 文字){
		long eventTime = SystemClock.uptimeMillis();
		
		if(文字=='a')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_A));
		if(文字=='A')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_A, 1, 65 ));
		if(文字=='b')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_B));
		if(文字=='B')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_B, 1, 65 ));
		if(文字=='c')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_C));
		if(文字=='C')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_C, 1, 65 ));
		if(文字=='d')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_D));
		if(文字=='D')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_D, 1, 65 ));
		if(文字=='e')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_E));
		if(文字=='E')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_E, 1, 65 ));
		if(文字=='f')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_F));
		if(文字=='F')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_F, 1, 65 ));
		if(文字=='g')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_G));
		if(文字=='G')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_G, 1, 65 ));
		if(文字=='h')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_H));
		if(文字=='H')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_H, 1, 65 ));
		if(文字=='i')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_I));
		if(文字=='I')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_I, 1, 65 ));
		if(文字=='j')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_J));
		if(文字=='J')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_J, 1, 65 ));
		if(文字=='k')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_K));
		if(文字=='K')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_K, 1, 65 ));
		if(文字=='l')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_L));
		if(文字=='L')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_L, 1, 65 ));
		if(文字=='m')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_M));
		if(文字=='M')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_M, 1, 65 ));
		if(文字=='n')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_N));
		if(文字=='N')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_N, 1, 65 ));
		if(文字=='o')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_O));
		if(文字=='O')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_O, 1, 65 ));
		if(文字=='p')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_P));
		if(文字=='P')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_P, 1, 65 ));
		if(文字=='q')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_Q));
		if(文字=='Q')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_Q, 1, 65 ));
		if(文字=='r')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_R));
		if(文字=='R')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_R, 1, 65 ));
		if(文字=='s')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_S));
		if(文字=='S')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_S, 1, 65 ));
		if(文字=='t')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_T));
		if(文字=='T')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_T, 1, 65 ));
		if(文字=='u')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_U));
		if(文字=='U')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_U, 1, 65 ));
		if(文字=='v')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_V));
		if(文字=='V')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_V, 1, 65 ));
		if(文字=='w')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_W));
		if(文字=='W')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_W, 1, 65 ));
		if(文字=='x')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_X));
		if(文字=='X')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_X, 1, 65 ));
		if(文字=='y')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_Y));
		if(文字=='Y')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_Y, 1, 65 ));
		if(文字=='z')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_Z));
		if(文字=='Z')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_Z, 1, 65 ));
		
		if(文字=='0')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_0));
		if(文字=='1')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_1));
		if(文字=='2')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_2));
		if(文字=='3')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_3));
		if(文字=='4')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_4));
		if(文字=='5')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_5));
		if(文字=='6')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_6));
		if(文字=='7')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_7));
		if(文字=='8')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_8));
		if(文字=='9')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_9));
		
		//シフトなし
		if(文字=='+')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_PLUS));
		if(文字=='-')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_MINUS));
		if(文字=='*')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_STAR));
		if(文字=='/')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_SLASH));
		
		if(文字=='@')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_AT));
		if(文字=='-')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_EQUALS));
		if(文字=='^')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_GRAVE));	
		if(文字==';')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_SEMICOLON));
		if(文字=='.')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_PERIOD));	
		if(文字==',')mv.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_COMMA));
		
		//シフト付き
		if(文字=='_')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_BACKSLASH, 1, 65 ));
		if(文字=='=')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_EQUALS, 1, 65 ));
		if(文字=='~')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_GRAVE, 1, 65 ));
		if(文字=='|')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_YEN, 1, 65 ));
		if(文字=='!')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_1, 1, 65 ));
		if(文字=='"')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_2, 1, 65 ));
		if(文字=='#')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_3, 1, 65 ));
		if(文字=='$')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_4, 1, 65 ));
		if(文字=='%')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_5, 1, 65 ));
		if(文字=='&')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_6, 1, 65 ));
		if(文字=='(')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_8, 1, 65 ));
		if(文字==')')mv.dispatchKeyEvent(new KeyEvent( eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_9, 1, 65 ));
	}

}
