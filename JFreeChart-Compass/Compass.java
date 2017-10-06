/**
 *
 * @author AlphaBAT69
 */

import java.awt.BorderLayout;
import java.awt.Color;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CompassPlot;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.general.ValueDataset;
public class Compass extends javax.swing.JFrame {

    /**
     * Creates new form Compass
     */
    static double degree=0.0;
    static void getValue()
    {
        degree=Math.random()*360;
    }
    public Compass() {
        initComponents();
            
        
    }
private JFreeChart createChart(final ValueDataset dataset) {
        
        final CompassPlot plot = new CompassPlot(dataset);
        plot.setSeriesNeedle(3);
        plot.setSeriesPaint(0, Color.WHITE);
        plot.setSeriesOutlinePaint(0, Color.BLACK);
        plot.setDrawBorder(true);
        final JFreeChart chart = new JFreeChart(plot);
        return chart;
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 166, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 132, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(556, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //outer
        Compass obj=new Compass();
        obj.setVisible(true);
        ValueDataset dataset;
        boolean b=true;
        //outer end
            getValue();
            dataset=new DefaultValueDataset(degree);
            final JFreeChart chart = obj.createChart(dataset);
            obj.panel.setLayout(new java.awt.BorderLayout());
            ChartPanel pan = new ChartPanel(chart);
            pan.setPreferredSize(new java.awt.Dimension(500, 270));
            pan.setEnforceFileExtensions(false);
            //setContentPane(pan);
            obj.panel.add(pan,BorderLayout.CENTER);
            obj.panel.validate();/*
        while(b){
            //inner
            getValue();
            dataset=new DefaultValueDataset(degree);
            final JFreeChart chart = obj.createChart(dataset);
            obj.panel.setLayout(new java.awt.BorderLayout());
            ChartPanel pan = new ChartPanel(chart);
            pan.setPreferredSize(new java.awt.Dimension(500, 270));
            pan.setEnforceFileExtensions(false);
            //setContentPane(pan);
            obj.panel.add(pan,BorderLayout.CENTER);
            obj.panel.validate();
            //inner end
        }*/
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel panel;
    // End of variables declaration                   
}
