package com.todo.menu;
public class Menu {

    public static void displaymenu()
    {
        System.out.println("__________________________________\n");
        System.out.println("         <Command Help>");
        System.out.println("  'add' -> �׸� �߰�");
        System.out.println("  'del' -> �׸� ����");
        System.out.println("  'edit' -> �׸� ����|");
        System.out.println("  'ls' -> ��ü ���");
        System.out.println("  'find A' -> A ������ ����, ���� ã��");
        System.out.println("  'find_cate A' -> A ������ ī�װ��� ã��");
        System.out.println("  'ls_name_asc' -> ����� ����");
        System.out.println("  'ls_name_desc' -> �̸��� ����");
        System.out.println("  'ls_date' -> ��¥�� ����");
        System.out.println("  'ls_date_desc' -> ��¥�� ������");
        System.out.println("  'ls_cate' -> ī�װ����� ����");
        System.out.println("  'exit' -> ���α׷� ����");
        System.out.println("__________________________________");
    }
    public static void prompt() {
    	System.out.print("\nCommand('help') -> ");
    }
}