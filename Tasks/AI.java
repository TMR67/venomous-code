class AI {

    public static void main(String[] args) {

        String firstAI = "ChatGPT";
        String secondAI = "Bard";
        String thirdAI = "DALL-E";
        String fourthAI = "Midjourney";

        System.out.println("AI Model Names");
        System.out.println("---------------------------");

        String[] aiNames = {firstAI, secondAI, thirdAI, fourthAI};

        for (int i = 0; i < aiNames.length; i++) {
            System.out.println(aiNames[i]);
        }
        
        System.out.println("AI Model IDs");
        System.out.println("---------------------------");

        int chatGPTId = 101;
        int bardId = 102;
        int dallEId = 103;
        int midjourneyId = 104;

        int[] aiIds = {chatGPTId, bardId, dallEId, midjourneyId};

        for (int i = 0; i < aiIds.length; i++) {
            System.out.println(aiIds[i]);
        }

        System.out.println("AI Model Versions");
        System.out.println("---------------------------");

        double chatGPTVersion = 4.0;
        double bardVersion = 1.5;
        double dallEVersion = 3.0;
        double midjourneyVersion = 5.2;

        double[] aiVersions = {chatGPTVersion, bardVersion, dallEVersion, midjourneyVersion};

        for (int i = 0; i < aiVersions.length; i++) {
            System.out.println(aiVersions[i]);
        }

        System.out.println("AI Model Accuracy (%)");
        System.out.println("---------------------------");

        float chatGPTAccuracy = 95.5f;
        float bardAccuracy = 92.0f;
        float dallEAccuracy = 90.8f;
        float midjourneyAccuracy = 91.5f;

        float[] aiAccuracy = {chatGPTAccuracy, bardAccuracy, dallEAccuracy, midjourneyAccuracy};

        for (int i = 0; i < aiAccuracy.length; i++) {
            System.out.println(aiAccuracy[i]);
        }

        System.out.println("AI Active Status");
        System.out.println("---------------------------");

        boolean chatGPTActive = true;
        boolean bardActive = true;
        boolean dallEActive = true;
        boolean midjourneyActive = false;

        boolean[] aiActive = {chatGPTActive, bardActive, dallEActive, midjourneyActive};

        for (int i = 0; i < aiActive.length; i++) {
            System.out.println(aiActive[i]);
        }

        System.out.println("AI Model Categories");
        System.out.println("---------------------------");

        char chatGPTCategory = 'L'; 
        char bardCategory = 'L';
        char dallECategory = 'I'; 
        char midjourneyCategory = 'I';

        char[] aiCategories = {chatGPTCategory, bardCategory, dallECategory, midjourneyCategory};

        for (int i = 0; i < aiCategories.length; i++) {
            System.out.println(aiCategories[i]);
        }
    }
}