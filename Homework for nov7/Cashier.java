/* Cashier class
   Anderson, Franceschi
   Belloli, Thomas
*/
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class Cashier extends JFrame
{
   private Cart cart;
   private Item previousItem;
   private double currentTotal;

   public Cashier( )
   {
      super( "Chapter 6 Programming Activity 1" );
      cart = new Cart( );
      previousItem = null;
      currentTotal = 0.0;
      getContentPane( ).setBackground( cart.getBackground( ) );
      setSize( 300, 300 );
      setVisible( true );
   }

   public void checkout( )
   {
      //total up the cost of all items in the cart and create animation
      DecimalFormat money = new DecimalFormat( "$0.00" );
      double total = 0.00;
      Item newItem;
      double price = 0.00;
      while (price != -0.99)
      {
         newItem = getNext();
         price = newItem.getPrice();
         if (price != -0.99)
         {
            total = price + total;
            animate(total);
         }
      }
      //format and output total
      JOptionPane.showMessageDialog(null, "The total is: " + money.format(total));
   }

   public Item getNext( )
   {
   // get next item
   // if the first item is the divider, that is ok - the cart is empty
      int number = ( (int) (Math.random( ) * cart.getItemSize( ) ) );
      cart.setCurrentItem( number );
   
   // update previousItem so that we can keep track of the current total
      previousItem = cart.getItems( )[cart.getCurrentItem( )];
   
   // update currentTotal
      if ( ( previousItem != null ) && ( previousItem.getPrice( ) >= 0 ) )
         currentTotal += previousItem.getPrice( );
      cart.setExactTotal( currentTotal );
   
   // animate divider if necessary
      if ( number == 3 )
         animate( cart.getTotal( ) );
      return ( cart.getItems( ) )[cart.getCurrentItem( )];
   }

   public void animate( double subtotal )
   {
      cart.updateTotal( subtotal );
   
      repaint( );
      try {
         Thread.sleep( 3000 );  // wait for the animation to finish
      }
      catch ( Exception e )
      {
      }
   }

   public void paint( Graphics g )
   {
      super.paint( g );
      cart.draw( g );
   }

   public static void main( String [] args )
   {
      Cashier app = new Cashier( );
      app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      app.checkout( );
   }
}