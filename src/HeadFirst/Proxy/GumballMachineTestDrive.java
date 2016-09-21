package HeadFirst.Proxy;

import HeadFirst.Status.GumballMachine;

import java.util.Scanner;

/**
 * @author NikoBelic
 * @create 9/20/16 14:19
 */
public class GumballMachineTestDrive
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入机器名称:");
        String name = scanner.next();
        System.out.println("请输入糖果数量:");
        int count = scanner.nextInt();

        GumballMachine gumballMachine = new GumballMachine(name,count);
        GumballMonitor monitor = new GumballMonitor(gumballMachine);
        monitor.report();
    }
}
