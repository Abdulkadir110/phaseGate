name = input("What is your name: ")
 
extrovertOrIntrovertOptions = []
sensingOrIntuitionOptions = []
thinkingOrFeelingOptions = []
judgingOrPerceivingOptions = []
 
energyChosenAnswers = []
informationChosenAnswers = []
decisionChosenAnswers = []
outerLifeChosenAnswers = []
answer = "";
        
questions = ["[A] expend energy,enjoy groups  [B] conserve energy, enjoy one-on-one", "[A] more outgoing, think out loud    [B] more reserved, think to yourself", "[A] seek many tasks, public activities, interactions with others   [B] seek private,solitary activities with quiet to concentrate", "[A] external, communicative, express yourself, [B] internal, reticent, keep to yourself", "[A] active, initiate     [B] reflective, deliberate", "[A] interpret literally                         [B] look for meaning and possibilities", "[A] practical, realistic, experiential          [B] imaginative, innovative, theorectical","[A] standard, usual, conventional               [B] different, novel, unique", "[A] focus on here-and-now                       [B] look to the future, global perspective, big picture", "[A] facts, things, what is                      [B] ideas, dreams, what could be, philosophical", "[A] logical, thinking, questioning              [B] empathetic, feeling, accommodating", "[A] candid, straight forward, frank             [B] tactful, kind, encouraging", "[A] firm, tend to criticize, hold the line      [B]  gentle, tend to appreciate, conciliate", "[A] tough-minded, just                          [B] tender-hearted, merciful", "[A] matter of fact, issue-oriented              [B] sensitive, people-oriented, compassionate", "[A] organized, orderly                          [B] flexible, adaptable", "[A] plan, schedule                              [B] unplanned, spontaneous", "[A] regulated, structure                        [B] easy going, live and let live", "[A] preperation, plan ahead                     [B] go with the flow, adapt as you go", "[A] control, govern                             [B] latitude, freedom"]
        
questionsDefualt = ["A. expend energy,enjoy groups","B. conserve energy, enjoy one-on-one","A. more outgoing, think out loud","B. more reserved, think to yourself","A. seek many tasks, public activities, interactions with others","B. seek private,solitary activities with quiet to concentrate", "A. external, communicative, express yourself, ","B. internal, reticent, keep to yourself", "A. active, initiate  ","B. reflective, deliberate", "A. interpret literally","B. look for meaning and possibilities","A. practical, realistic, experiential","B. imaginative, innovative, theorectical","A. standard, usual, conventional","B. different, novel, unique","A. focus on here-and-now","B. look to the future, global perspective, big picture","A. facts, things, what is","B. ideas, dreams, what could be, philosophical", "A. logical, thinking, questioning","B. empathetic, feeling, accommodating", "A. candid, straight forward, frank","B. tactful, kind, encouraging", "A. firm, tend to criticize, hold the line","B. gentle, tend to appreciate, conciliate", "A. tough-minded, just","B. tender-hearted, merciful", "A. matter of fact, issue-oriented","B. sensitive, people-oriented, compassionate","A. organized, orderly","B. flexible, adaptable", "A. plan, schedule","B. unplanned, spontaneous", "A. regulated, structure","B. easy going, live and let live","A. preperation, plan ahead","B. go with the flow, adapt as you go", "A. control, govern","B. latitude, freedom"];
        
energyAnswerIndex = 0
questionIndex = 0
energyIndex = 0
questionsDefualtIndex = 0
informationIndex = 0
informationAnswerIndex = 0
decisionAnswerIndex = 0
decisionIndex =0
outerLifeIndex = 0
outerLifeAnswerIndex = 0
while(questionIndex < 20) :
    if(questionIndex >= 0 and questionIndex < 5) :
        print(questions[questionIndex]);
        answer = input("Enter your choice(A/B): ").upper()
        if(answer == "A"):
            extrovertOrIntrovertOptions.append(answer);
            energyChosenAnswers.append(questionsDefualt[questionsDefualtIndex]);
            questionsDefualtIndex += 2;
            energyAnswerIndex += 1
            questionIndex += 1
            energyIndex += 1
        
        elif (answer == "B"):
            if(questionsDefualtIndex % 2 == 0):
                questionsDefualtIndex += 1;
            
            extrovertOrIntrovertOptions.append(answer);
            energyChosenAnswers.append(questionsDefualt[questionsDefualtIndex]);
            questionsDefualtIndex += 1;
            energyAnswerIndex += 1
            questionIndex += 1
            energyIndex += 1
        
        else :
            print("Expected A or B as Response");
        
               
 
    elif(questionIndex >= 5 and questionIndex < 10) :
        print(questions[questionIndex]);
        answer = input("Enter your choice(A/B): ").upper()
        if(answer == "A"):
            sensingOrIntuitionOptions.append(answer);
            informationChosenAnswers.append(questionsDefualt[questionsDefualtIndex]);
            questionsDefualtIndex += 2;
            informationAnswerIndex += 1
            questionIndex += 1
            informationIndex += 1
        
        elif (answer == "B"):
            if(questionsDefualtIndex % 2 == 0):
                questionsDefualtIndex += 1;
            
            sensingOrIntuitionOptions.append(answer);
            informationChosenAnswers.append(questionsDefualt[questionsDefualtIndex]);
            questionsDefualtIndex += 1;
            informationAnswerIndex += 1
            questionIndex += 1
            informationIndex += 1
        
        else :
            print("Expected A or B as Response");
        
     
     
    elif(questionIndex >= 10 and questionIndex < 15) :
        print(questions[questionIndex]);
        answer = input("Enter your choice(A/B): ").upper()
        if(answer == "A"):
            thinkingOrFeelingOptions.append(answer);
            decisionChosenAnswers.append(questionsDefualt[questionsDefualtIndex]);
            questionsDefualtIndex += 2;
            decisionAnswerIndex += 1
            questionIndex += 1
            decisionIndex += 1
        
        elif (answer == "B"):
            if(questionsDefualtIndex % 2 == 0):
                questionsDefualtIndex += 1;
            
            thinkingOrFeelingOptions.append(answer);
            decisionChosenAnswers.append(questionsDefualt[questionsDefualtIndex]);
            questionsDefualtIndex += 1;
            decisionAnswerIndex += 1
            questionIndex += 1
            decisionIndex += 1
        
        else :
            print("Expected A or B as Response");
        
     
     
    elif(questionIndex >= 15 and questionIndex < 20) :
        print(questions[questionIndex]);
        answer = input("Enter your choice(A/B): ").upper()
        if(answer == "A"):
            judgingOrPerceivingOptions.append(answer);
            outerLifeChosenAnswers.append(questionsDefualt[questionsDefualtIndex]);
            questionsDefualtIndex += 2;
            outerLifeAnswerIndex += 1
            questionIndex += 1
            outerLifeIndex += 1
        
        elif (answer == "B"):
            if(questionsDefualtIndex % 2 == 0):
                questionsDefualtIndex += 1;
            
            judgingOrPerceivingOptions.append(answer);
            outerLifeChosenAnswers.append(questionsDefualt[questionsDefualtIndex]);
            questionsDefualtIndex += 1;
            outerLifeAnswerIndex += 1
            questionIndex += 1
            outerLifeIndex += 1
        
        else :
            print("Expected A or B as Response");
     
print();
print();
for count in range(len(energyChosenAnswers)):
    print(energyChosenAnswers[count]);
 
optionACount = 0;
optionBCount = 0;
for index in range(len(extrovertOrIntrovertOptions)):
    if(extrovertOrIntrovertOptions[index] == "A"):
        optionACount += 1
    
    elif(extrovertOrIntrovertOptions[index] == "B"):
        optionBCount += 1
    
 
print("Number Of A selected: " + str(optionACount));
print("Number Of B selected: " + str(optionBCount));
 
for count in range(len(informationChosenAnswers)):
    print(informationChosenAnswers[count]);
 
optionACountInfo = 0;
optionBCountInfo = 0;
for index in range(len(sensingOrIntuitionOptions)):
    if(sensingOrIntuitionOptions[index] == "A"):
        optionACountInfo += 1
    
    elif(sensingOrIntuitionOptions[index] == "B"):
        optionBCountInfo += 1
    
 
print("Number Of A selected: " + str(optionACountInfo));
print("Number Of B selected: " + str(optionBCountInfo));
 
for count in range(len(decisionChosenAnswers)):
    print(decisionChosenAnswers[count]);
 
optionACountDecision = 0;
optionBCountDecision = 0;
 
for index in range(len(thinkingOrFeelingOptions)):
    if(thinkingOrFeelingOptions[index] == "A"):
        optionACountDecision += 1
    
    elif(thinkingOrFeelingOptions[index] == "B"):
        optionBCountDecision += 1
    
 
print("Number Of A selected: " + str(optionACountDecision));
print("Number Of B selected: " + str(optionBCountDecision));
 
for count in range(len(outerLifeChosenAnswers)):
    print(outerLifeChosenAnswers[count]);
 
optionACountOuterLife = 0;
optionBCountOuterLife = 0;
 
for index in range(len(judgingOrPerceivingOptions)):
    if(judgingOrPerceivingOptions[index] == "A"):
        optionACountOuterLife += 1
    
    elif(judgingOrPerceivingOptions[index] == "B"):
        optionBCountOuterLife += 1
    
 
print("Number Of A selected: " + str(optionACountOuterLife));
print("Number Of B selected: " + str(optionBCountOuterLife));
 
if(optionACount >= optionBCount) : energyLetter = 'E'
else : energyLetter = 'I'
           
if(optionACountInfo >= optionBCountInfo) : informationLetter = 'S'
else : informationLetter = 'N'
 
if(optionACountDecision >= optionBCountDecision) : decisionLetter = 'T'
else : decisionLetter = 'F'
            
if(optionACountOuterLife >= optionBCountOuterLife) : outerLifeLetter = 'J'
else : outerLifeLetter = 'P'
 
 
personalityType = "" + energyLetter + informationLetter + decisionLetter + outerLifeLetter;
 
print(name + ", your Myers-Briggs personality type is: " + personalityType);
 
