import java.util.Scanner;
 
public class MyersBriggsTypeIndicatorPersonalityTest {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is your name: ");
        String name = input.nextLine();
        
        String[] extrovertOrIntrovert = new String[5];
        String[] sensingOrIntuition = new String[5];
        String[] thinkingOrFeeling = new String[5];
        String[] judgingOrPerceiving = new String[5];
        
        String[] energyChosenAnswers = new String[5];
        String[] informationChosenAnswers = new String[5];
        String[] decisionChosenAnswers = new String[5];
        String[] outerLifeChosenAnswers = new String[5];
        String answer = "";
        
        String[] questions = {"[A] expend energy,enjoy groups  [B] conserve energy, enjoy one-on-one", "[A] more outgoing, think out loud    [B] more reserved, think to yourself", "[A] seek many tasks, public activities, interactions with others   [B] seek private,solitary activities with quiet to concentrate", "[A] external, communicative, express yourself, [B] internal, reticent, keep to yourself", "[A] active, initiate     [B] reflective, deliberate", "[A] interpret literally                         [B] look for meaning and possibilities", "[A] practical, realistic, experiential          [B] imaginative, innovative, theorectical","[A] standard, usual, conventional               [B] different, novel, unique", "[A] focus on here-and-now                       [B] look to the future, global perspective, big picture", "[A] facts, things, what is                      [B] ideas, dreams, what could be, philosophical", "[A] logical, thinking, questioning              [B] empathetic, feeling, accommodating", "[A] candid, straight forward, frank             [B] tactful, kind, encouraging", "[A] firm, tend to criticize, hold the line      [B]  gentle, tend to appreciate, conciliate", "[A] tough-minded, just                          [B] tender-hearted, merciful", "[A] matter of fact, issue-oriented              [B] sensitive, people-oriented, compassionate", "[A] organized, orderly                          [B] flexible, adaptable", "[A] plan, schedule                              [B] unplanned, spontaneous", "[A] regulated, structure                        [B] easy going, live and let live", "[A] preperation, plan ahead                     [B] go with the flow, adapt as you go", "[A] control, govern                             [B] latitude, freedom"};
        
         String[] questionsDefualt = {"A. expend energy,enjoy groups","B. conserve energy, enjoy one-on-one","A. more outgoing, think out loud","B. more reserved, think to yourself","A. seek many tasks, public activities, interactions with others","B. seek private,solitary activities with quiet to concentrate", "A. external, communicative, express yourself, ","B. internal, reticent, keep to yourself", "A. active, initiate  ","B. reflective, deliberate", "A. interpret literally","B. look for meaning and possibilities","A. practical, realistic, experiential","B. imaginative, innovative, theorectical","A. standard, usual, conventional","B. different, novel, unique","A. focus on here-and-now","B. look to the future, global perspective, big picture","A. facts, things, what is","B. ideas, dreams, what could be, philosophical", "A. logical, thinking, questioning","B. empathetic, feeling, accommodating", "A. candid, straight forward, frank","B. tactful, kind, encouraging", "A. firm, tend to criticize, hold the line","B. gentle, tend to appreciate, conciliate", "A. tough-minded, just","B. tender-hearted, merciful", "A. matter of fact, issue-oriented","B. sensitive, people-oriented, compassionate","A. organized, orderly","B. flexible, adaptable", "A. plan, schedule","B. unplanned, spontaneous", "A. regulated, structure","B. easy going, live and let live","A. preperation, plan ahead","B. go with the flow, adapt as you go", "A. control, govern","B. latitude, freedom"};
        
        int energyAnswerIndex = 0;
        int questionIndex = 0;
        int energyIndex = 0;
        int questionsDefualtIndex = 0;
        int informationIndex = 0;
        int informationAnswerIndex = 0;
        int decisionAnswerIndex = 0;
        int decisionIndex =0;
        int outerLifeIndex = 0;
        int outerLifeAnswerIndex = 0;
        while(questionIndex < 20){
            if(questionIndex >= 0 && questionIndex < 5) {
                System.out.println(questions[questionIndex]);
                answer = input.next().toUpperCase();
                if(answer.equals("A")){
                    extrovertOrIntrovert[energyAnswerIndex] = answer;
                    energyChosenAnswers[energyIndex] = questionsDefualt[questionsDefualtIndex];
                    questionsDefualtIndex += 2;
                    energyAnswerIndex++;
                    questionIndex++;
                    energyIndex++;
                }
                else if (answer.equals("B")){
                    if(questionsDefualtIndex % 2 == 0){
                        questionsDefualtIndex += 1;
                    }
                    extrovertOrIntrovert[energyAnswerIndex] = answer;
                    energyChosenAnswers[energyIndex] = questionsDefualt[questionsDefualtIndex];
                    questionsDefualtIndex += 1;
                    energyAnswerIndex++;
                    questionIndex++;
                    energyIndex++;
                }
                else {
                    System.out.println("Expected A or B as Response");
                }
            }           
            
            else if(questionIndex >= 5 && questionIndex < 10) {
                System.out.println(questions[questionIndex]);
                answer = input.next().toUpperCase();
                if(answer.equals("A")){
                    sensingOrIntuition[informationAnswerIndex] = answer;
                    informationChosenAnswers[informationIndex] = questionsDefualt[questionsDefualtIndex];
                    questionsDefualtIndex += 2;
                    informationAnswerIndex++;
                    questionIndex++;
                    informationIndex++;
                }
                else if (answer.equals("B")){
                    if(questionsDefualtIndex % 2 == 0){
                        questionsDefualtIndex += 1;
                    }
                    sensingOrIntuition[informationAnswerIndex] = answer;
                    informationChosenAnswers[informationIndex] = questionsDefualt[questionsDefualtIndex];
                    questionsDefualtIndex += 1;
                    informationAnswerIndex++;
                    questionIndex++;
                    informationIndex++;
                }
                else {
                    System.out.println("Expected A or B as Response");
                }
             }
             
             else if(questionIndex >= 10 && questionIndex < 15) {
                System.out.println(questions[questionIndex]);
                answer = input.next().toUpperCase();
                if(answer.equals("A")){
                    thinkingOrFeeling[decisionAnswerIndex] = answer;
                    decisionChosenAnswers[decisionIndex] = questionsDefualt[questionsDefualtIndex];
                    questionsDefualtIndex += 2;
                    decisionAnswerIndex++;
                    questionIndex++;
                    decisionIndex++;
                }
                else if (answer.equals("B")){
                    if(questionsDefualtIndex % 2 == 0){
                        questionsDefualtIndex += 1;
                    }
                    thinkingOrFeeling[decisionAnswerIndex] = answer;
                    decisionChosenAnswers[decisionIndex] = questionsDefualt[questionsDefualtIndex];
                    questionsDefualtIndex += 1;
                    decisionAnswerIndex++;
                    questionIndex++;
                    decisionIndex++;
                }
                else {
                    System.out.println("Expected A or B as Response");
                }
             }
             
             else if(questionIndex >= 15 && questionIndex < 20) {
                System.out.println(questions[questionIndex]);
                answer = input.next().toUpperCase();
                if(answer.equals("A")){
                    judgingOrPerceiving[outerLifeAnswerIndex] = answer;
                    outerLifeChosenAnswers[outerLifeIndex] = questionsDefualt[questionsDefualtIndex];
                    questionsDefualtIndex += 2;
                    outerLifeAnswerIndex++;
                    questionIndex++;
                    outerLifeIndex++;
                }
                else if (answer.equals("B")){
                    if(questionsDefualtIndex % 2 == 0){
                        questionsDefualtIndex += 1;
                    }
                    judgingOrPerceiving[outerLifeAnswerIndex] = answer;
                    outerLifeChosenAnswers[outerLifeIndex] = questionsDefualt[questionsDefualtIndex];
                    questionsDefualtIndex += 1;
                    outerLifeAnswerIndex++;
                    questionIndex++;
                    outerLifeIndex++;
                }
                else {
                    System.out.println("Expected A or B as Response");
                }
             }
             
            }
            
            System.out.println();
            System.out.println();
            for (int count = 0; count < energyChosenAnswers.length; count++){
                System.out.println(energyChosenAnswers[count]);
            }
            int optionACount = 0;
            int optionBCount = 0;
            for(int index = 0; index < extrovertOrIntrovert.length; index++){
                if(extrovertOrIntrovert[index].equals("A")){
                    optionACount++;
                }
                else if(extrovertOrIntrovert[index].equals("B")){
                    optionBCount++;
                }
            }
            System.out.println("Number Of A selected: " + optionACount);
            System.out.println("Number Of B selected: " + optionBCount);
        
            for (int count = 0; count < informationChosenAnswers.length; count++){
                System.out.println(informationChosenAnswers[count]);
            }
            int optionACountInfo = 0;
            int optionBCountInfo = 0;
            for(int index = 0; index < sensingOrIntuition.length; index++){
                if(sensingOrIntuition[index].equals("A")){
                    optionACountInfo++;
                }
                else if(sensingOrIntuition[index].equals("B")){
                    optionBCountInfo++;
                }
            }
            System.out.println("Number Of A selected: " + optionACountInfo);
            System.out.println("Number Of B selected: " + optionBCountInfo);
        
            for (int count = 0; count < decisionChosenAnswers.length; count++){
                System.out.println(decisionChosenAnswers[count]);
            }
            int optionACountDecision = 0;
            int optionBCountDecision = 0;
            for(int index = 0; index < thinkingOrFeeling.length; index++){
                if(thinkingOrFeeling[index].equals("A")){
                    optionACountDecision++;
                }
                else if(thinkingOrFeeling[index].equals("B")){
                    optionBCountDecision++;
                }
            }
            System.out.println("Number Of A selected: " + optionACountDecision);
            System.out.println("Number Of B selected: " + optionBCountDecision);
        
            for (int count = 0; count < outerLifeChosenAnswers.length; count++){
                System.out.println(outerLifeChosenAnswers[count]);
            }
            int optionACountOuterLife = 0;
            int optionBCountOuterLife = 0;
            for(int index = 0; index < judgingOrPerceiving.length; index++){
                if(judgingOrPerceiving[index].equals("A")){
                    optionACountOuterLife++;
                }
                else if(judgingOrPerceiving[index].equals("B")){
                    optionBCountOuterLife++;
                }
            }
            System.out.println("Number Of A selected: " + optionACountOuterLife);
            System.out.println("Number Of B selected: " + optionBCountOuterLife);
        
            char energyLetter;
            if(optionACount >= optionBCount)energyLetter = 'E';
            else energyLetter = 'I';
                        
            char informationLetter;
            if(optionACountInfo >= optionBCountInfo)informationLetter = 'S';
            else informationLetter = 'N';            
            
            char decisionLetter;
            if(optionACountDecision >= optionBCountDecision)decisionLetter = 'T';
            else decisionLetter = 'F';
                        
            char outerLifeLetter;
            if(optionACountOuterLife >= optionBCountOuterLife)outerLifeLetter = 'J';
            else  outerLifeLetter = 'P';
            
            
            String personalityType = "" + energyLetter + informationLetter + decisionLetter + outerLifeLetter;
        
            System.out.println(name + ", your Myers-Briggs personality type is: " + personalityType);
        
    }
    
}
 
