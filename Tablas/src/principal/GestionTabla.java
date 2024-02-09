
package principal;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author nicolastapasco
 */
public class GestionTabla implements TableCellRenderer{
    
    public Component getTableCellRendererComponent(JTable table, Object value,boolean isSelected, boolean isFocus, int row, int column){
        JComponent jcomponent = null;
        
        if(value instanceof String) {
            jcomponent = new JLabel((String) value);
            ((JLabel) jcomponent).setHorizontalAlignment(SwingConstants.CENTER);
            ((JLabel) jcomponent).setSize(30, jcomponent.getWidth() );
            ((JLabel) jcomponent).setPreferredSize(new Dimension(6, jcomponent.getWidth()));
        }
        
        jcomponent.setBackground(new Color(65,65,65) );
        jcomponent.setOpaque(true);
        
        
        return jcomponent;
    }
}
