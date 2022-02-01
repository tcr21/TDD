/* Recently Used List
- The list should be empty when initialised
- We should be able to add things to the list
- We should be able to retrieve items from the list
- The most recent item should be first in the list
- Items in the list are unique, so duplicate insertions should be moved rather than added
*/

package ic.doc;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class RecentlyUsedListTest {

  RecentlyUsedList recentlyUsedList = new RecentlyUsedList();

  @Test
  public void listIsEmptyWhenInitialised() {
    assertThat(recentlyUsedList.getNumberOfItems(), is(0));
  }

  @Test
  public void canAddThingsToList(){
    int previousNumberOfItems = recentlyUsedList.getNumberOfItems();
    String item = "07000000000";
    recentlyUsedList.addItemToList(item);
    assertEquals(previousNumberOfItems + 1, recentlyUsedList.getNumberOfItems());
  }

}
