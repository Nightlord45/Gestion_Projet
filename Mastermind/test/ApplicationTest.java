import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.*;

import play.mvc.*;
import play.test.*;
import play.data.DynamicForm;
import play.data.validation.ValidationError;
import play.data.validation.Constraints.RequiredValidator;
import play.i18n.Lang;
import play.libs.F;
import play.libs.F.*;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;
import static org.junit.Assert.*;

import models.Decimal;


/**
*
* Simple (JUnit) tests that can call all parts of a play app.
* If you are interested in mocking a whole application, see the wiki for more details.
*
*/
public class ApplicationTest {
    
    
    @Test
	public void en_decimal(){
	int [] code= {1,2,3,4};
	int [] valeur= {2,3,4,5};
	int [] valeur2 = {1,2,3,4};
	int [] valeur1 = {1,4,0,2};
	assertArrayEquals(code,valeur2);
    }
    
    @Test
	public void compteur(){
	assertEquals(10,new Decimal().getCompteur());
    }
    
	@Test
	public void sortie(){
		if (getCompteur().compteur == 0){
			assertThat("Nombre maximal d'éssais ateint").isEqualTo(sortie().messFin);
		}
	}


    @Test
	public void simpleCheck() {
        int a = 1 + 1;
        assertThat(a).isEqualTo(2);
    }

    @Test
	public void renderTemplate() {
        Content html = views.html.index.render("Your new application is ready.");
        assertThat(contentType(html)).isEqualTo("text/html");
        assertThat(contentAsString(html)).contains("Your new application is ready.");
    }

    	
}
