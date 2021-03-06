/* Cashier class
   Anderson, Franceschi
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
      super( "Chapter 6 Programming Activity 2" );
      cart = new Cart( );
      previousItem = null;
      currentTotal = 0.0;
      getContentPane( ).setBackground( cart.getBackground( ) );
      setSize( 325, 300 );
      setVisible( true );
   }

   public void checkout( int numberOfItems )
   {
   
      DecimalFormat money = new DecimalFormat( "$0.00" );
      double total = 0.00;
      Item newItem;
      double price = 0.00;
      for (int index = 0; index < numberOfItems; index++)
      {
         newItem = getNext();
         price = newItem.getPrice();
         total = price + total;
         animate(total);
      }
      JOptionPane.showMessageDialog(null, "Your total is " + money.format(total));
   }

   public Item getNext( )
   {
      if ( cart.getTotalNumberItems( ) > cart.getNumberItems( ) )
      {
      // get next item
         cart.setCurrentItem ( (int) ( Math.random( ) * cart.getItemSize( ) ) );
      
      // update previousItem so that we can keep track of the current total
         previousItem = cart.getItems( )[cart.getCurrentItem( )];
      
      // update number of items in cart
         cart.updateNumberItems( );
      
      // update currentTotal
         if ( ( previousItem != null ) && ( previousItem.getPrice( ) >= 0 ) )
            currentTotal += previousItem.getPrice( );
         cart.setExactTotal( currentTotal );
      
         return ( cart.getItems( ) )[cart.getCurrentItem( )];
      }
      else
      {
         JOptionPane.showMessageDialog( null, "Error: getNext( ) method called when cart is empty",
                   "Logic error", JOptionPane.ERROR_MESSAGE );
         return null;
      }
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
      int numItems = 0;
      boolean goodInput = false;
      do
      {
         String howMany = JOptionPane.showInputDialog( null,
                 "Enter the number of items in the cart ( 1 - 10 )" );
         if ( howMany == null )
            System.exit( 0 );
         try
         {
            numItems = Integer.parseInt( howMany );
            goodInput = true;
         }
         catch( NumberFormatException nfe )
         {
         // goodInput is still false
         }
      } while ( !goodInput || numItems < 1 || numItems > 10 );
   
      ( app.cart ).updateTotalNumberItems( numItems );
      app.checkout( numItems );
   }
}
