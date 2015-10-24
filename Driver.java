public class Driver{
	
	public static void main(String args[]){
		
		ClarifaiClient clarifai = new ClarifaiClient(APP_ID, APP_SECRET);
		List<RecognitionResult> results =
    		clarifai.recognize(new RecognitionRequest(new File("kittens.jpg")));

		for (Tag tag : results.get(0).getTags()) {
  		System.out.println(tag.getName() + ": " + tag.getProbability());
}
		
	}
	
}
