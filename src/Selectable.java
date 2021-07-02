/**
 * Lab03a Instructions found on moodle
 * 
 * Style guidlines URL:-
 * http://www.cs.bilkent.edu.tr/~adayanik/cs101/practicalwork/styleguidelines.htm
 * 
 * 
 * @author Mostafa Higazy
 * @version 02/07/2021
 */

public interface Selectable {
    
    boolean getSelected();
    void setSelected(boolean selected);
    boolean contains(int x, int y);
}
