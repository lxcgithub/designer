package com.example.lib.j_command.test;

import com.example.lib.j_command.other.General;

/**
 * 调用端通过新建封装好的类进行功能调用
 * 隐藏了功能的具体实现
 */
public class Client {
	public static void main(String[] args) {
		General general = new General();
		general.attach();
		general.undo();
	}
}
