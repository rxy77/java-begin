package com.rxy.lesson;

public class test_math01 {
    public static void main(String[] args) {
        //A=！( p/  q ) & ( (p /r) / s)
        int p=0,q=0,r=0,s=0;//创建pqrs变量，各赋值为1
        System.out.println("pqrs"+"  结果");//打印表头
        for (int i = 0; i < 2; i++) {//p从0循环赋值到1
            p=i;

            for (int i1 = 0; i1 < 2; i1++) {//q从0循环赋值到1
                q=i1;

                for (int i2 = 0; i2 < 2; i2++) {//r从0循环赋值到1
                    r=i2;

                    for (int i3 = 0; i3 < 2; i3++) {//s从0循环赋值到1
                        s=i3;
                        System.out.print(p+""+""+q+""+r+""+s);//打印真值表
                        System.out.println("    "+qie(fei(ji(p,q)),ji(ji(p,r),s)));//计算命题公式
                    }
                }
            }

        }
    }
    public static int qie(int a,int b){//且
        int x;
        if(a==1&&b==1) x=1;
        else x=0;
        return x;
    }
    public static int ji(int a,int b){//主动析取
        int x;
        if(a==1||b==1) x=1;
        else x=0;
        return x;
    }
    public static int fei(int a){//非
        int x;
        if(a==1)
            x=0;
        else x=1;
        return x;
    }
}
