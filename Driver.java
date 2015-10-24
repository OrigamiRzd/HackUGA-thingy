package clarifai;

import java.io.File;
import java.util.List;
import java.awt.*;

import com.clarifai.api.ClarifaiClient;
import com.clarifai.api.InfoResult;
import com.clarifai.api.RecognitionRequest;
import com.clarifai.api.RecognitionResult;
import com.clarifai.api.Tag;

public class Driver {

	public static void main(String[] args) {
		
		ClarifaiClient clarifai = new ClarifaiClient("JmL29nN_tbRzA9_BxtRqrjjDun33EM_kUmQ4NkL2", "YIS9VZuIlOVAcNETCs78LvS85Btmv96rTgdWBJhf");
		String[] URLs = {"http://www.clarifai.com/img/metro-north.jpg",
				"http://android.okhelp.cz/wp-content/uploads/class-file-editor-source-not-found.png",
				"http://telepics.net/uploads/pictures/big_images/Chibi_Pikachu.jpg"};
		List<RecognitionResult> results =clarifai.recognize(new RecognitionRequest(URLs));
		
		for(int i = 0;i<URLs.length;i++){
			int x  = 0;
			for (Tag tag : results.get(i).getTags()) {	
			  System.out.println(tag.getName() + ": " + tag.getProbability());
			x++;
			}
			System.out.println(x);
		}


	}
}

