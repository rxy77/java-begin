package math;
import java.awt.*;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class UIApp extends JFrame {
    private JFreeChart chart;

    public static void main(String[] args) {
        UIApp uiApp = new UIApp();
    }
    public UIApp() throws HeadlessException {
        setTitle("math");//设置标题
        setSize(800, 600);//设置大小

        JTextField textField=new JTextField();//创建文本框
        add(textField);
        textField.setBounds(100,550,50,20);//设置大小位置

        textField.getDocument().addDocumentListener(new DocumentListener() {//文本监听
            @Override
            public void insertUpdate(DocumentEvent e) {//更新
                double x;
                try {
                    x=Double.parseDouble(textField.getText());
                    if (x<0.01)return;//值太小会死机，固x<0.01退出
                }catch (Exception ex){
                    return;
                }

                chart.getXYPlot().setDataset(func_dataset(x));//设置图标数据值
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                System.out.println("bbb");
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
        //创建点状图
        chart = ChartFactory.createScatterPlot("Title", "x", "y", null, PlotOrientation.VERTICAL, true, true, false);
        ChartPanel chartPanel = new ChartPanel(chart);//创建表面板对象
        add(chartPanel);
        setVisible(true);//设置可见
    }

    private XYDataset func_dataset(double delta) {
        XYSeries series = new XYSeries("delta=" + delta);//创建XY系列，可用来表示所有点（x，y）的坐标
        for (double t = 0; t <= 8; t += delta) {//遍历t
            series.add(t, func(t));//x，y点
        }
        XYSeriesCollection xyDataset = new XYSeriesCollection();//创建XY系列集合
        xyDataset.addSeries(series);//加入坐标系列
        return xyDataset;//xyDataset为XYSeriesCollection父类
    }

    private double func(double t) {
        return -(2 * t * Math.sin(Math.pow(t, 2)));//计算公式
    }

}
