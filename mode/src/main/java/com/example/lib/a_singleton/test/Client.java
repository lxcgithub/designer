package com.example.lib.a_singleton.test;

import com.example.lib.a_singleton.impClass.EnumManager;

public class  Client {
		public static void main(String[] args) {
			EnumManager.SDCardManager.getSingleton();
		}
}
