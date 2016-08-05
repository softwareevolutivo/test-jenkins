package ec.com.se;

import ec.com.se.business.Hit;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by pazfernando on 1/29/16.
 */
public class HitTest {
    @Test
    public void shouldReturnFivePoints() {
        Hit hit = new Hit();
        Assert.assertEquals("Player push puch", 4, hit.pushPunch());
    }
}
