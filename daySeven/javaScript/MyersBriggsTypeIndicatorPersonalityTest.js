
const prompt = require("prompt-sync")();
name = prompt("What is your name: ");
        
        let extrovertOrIntrovert = []
        let sensingOrIntuition = []
        let thinkingOrFeeling = []
        let judgingOrPerceiving = []
        
        let energyChosenAnswers = []
        let informationChosenAnswers = []
        let decisionChosenAnswers = []
        let outerLifeChosenAnswers = []
        let answer = "";
        
        let questions = ["[A] expend energy,enjoy groups  [B] conserve energy, enjoy one-on-one", "[A] more outgoing, think out loud    [B] more reserved, think to yourself", "[A] seek many tasks, public activities, interactions with others   [B] seek private,solitary activities with quiet to concentrate", "[A] external, communicative, express yourself, [B] internal, reticent, keep to yourself", "[A] active, initiate     [B] reflective, deliberate", "[A] interpret literally                         [B] look for meaning and possibilities", "[A] practical, realistic, experiential          [B] imaginative, innovative, theorectical","[A] standard, usual, conventional               [B] different, novel, unique", "[A] focus on here-and-now                       [B] look to the future, global perspective, big picture", "[A] facts, things, what is                      [B] ideas, dreams, what could be, philosophical", "[A] logical, thinking, questioning              [B] empathetic, feeling, accommodating", "[A] candid, straight forward, frank             [B] tactful, kind, encouraging", "[A] firm, tend to criticize, hold the line      [B]  gentle, tend to appreciate, conciliate", "[A] tough-minded, just                          [B] tender-hearted, merciful", "[A] matter of fact, issue-oriented              [B] sensitive, people-oriented, compassionate", "[A] organized, orderly                          [B] flexible, adaptable", "[A] plan, schedule                              [B] unplanned, spontaneous", "[A] regulated, structure                        [B] easy going, live and let live", "[A] preperation, plan ahead                     [B] go with the flow, adapt as you go", "[A] control, govern                             [B] latitude, freedom"]
        
         let questionsDefualt = ["A. expend energy,enjoy groups","B. conserve energy, enjoy one-on-one","A. more outgoing, think out loud","B. more reserved, think to yourself","A. seek many tasks, public activities, interactions with others","B. seek private,solitary activities with quiet to concentrate", "A. external, communicative, express yourself, ","B. internal, reticent, keep to yourself", "A. active, initiate  ","B. reflective, deliberate", "A. interpret literally","B. look for meaning and possibilities","A. practical, realistic, experiential","B. imaginative, innovative, theorectical","A. standard, usual, conventional","B. different, novel, unique","A. focus on here-and-now","B. look to the future, global perspective, big picture","A. facts, things, what is","B. ideas, dreams, what could be, philosophical", "A. logical, thinking, questioning","B. empathetic, feeling, accommodating", "A. candid, straight forward, frank","B. tactful, kind, encouraging", "A. firm, tend to criticize, hold the line","B. gentle, tend to appreciate, conciliate", "A. tough-minded, just","B. tender-hearted, merciful", "A. matter of fact, issue-oriented","B. sensitive, people-oriented, compassionate","A. organized, orderly","B. flexible, adaptable", "A. plan, schedule","B. unplanned, spontaneous", "A. regulated, structure","B. easy going, live and let live","A. preperation, plan ahead","B. go with the flow, adapt as you go", "A. control, govern","B. latitude, freedom"]
        
        let energyAnswerIndex = 0;
        let questionIndex = 0;
        let energyIndex = 0;
        let questionsDefualtIndex = 0;
        let informationIndex = 0;
        let informationAnswerIndex = 0;
        let decisionAnswerIndex = 0;
        let decisionIndex =0;
        let outerLifeIndex = 0;
        let outerLifeAnswerIndex = 0;
        while(questionIndex < 20){
            if(questionIndex >= 0 && questionIndex < 5) {
                console.log(questions[questionIndex]);
                answer = prompt("Enter A/B: ").toUpperCase();
                if(answer === "A"){
                    extrovertOrIntrovert[energyAnswerIndex] = answer;
                    energyChosenAnswers[energyIndex] = questionsDefualt[questionsDefualtIndex];
                    questionsDefualtIndex += 2;
                    energyAnswerIndex++;
                    questionIndex++;
                    energyIndex++;
                }
                else if (answer === "B"){
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
                    console.log("Expected A or B as Response");
                }
            }           
            
            else if(questionIndex >= 5 && questionIndex < 10) {
                console.log(questions[questionIndex]);
                answer = prompt("Enter A/B: ").toUpperCase();
                if(answer === "A"){
                    sensingOrIntuition[informationAnswerIndex] = answer;
                    informationChosenAnswers[informationIndex] = questionsDefualt[questionsDefualtIndex];
                    questionsDefualtIndex += 2;
                    informationAnswerIndex++;
                    questionIndex++;
                    informationIndex++;
                }
                else if (answer === "B"){
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
                    console.log("Expected A or B as Response");
                }
             }
             
             else if(questionIndex >= 10 && questionIndex < 15) {
                console.log(questions[questionIndex]);
                answer = prompt("Enter A/B: ").toUpperCase();
                if(answer === "A"){
                    thinkingOrFeeling[decisionAnswerIndex] = answer;
                    decisionChosenAnswers[decisionIndex] = questionsDefualt[questionsDefualtIndex];
                    questionsDefualtIndex += 2;
                    decisionAnswerIndex++;
                    questionIndex++;
                    decisionIndex++;
                }
                else if (answer === "B"){
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
                    console.log("Expected A or B as Response");
                }
             }
             
             else if(questionIndex >= 15 && questionIndex < 20) {
                console.log(questions[questionIndex]);
                answer = prompt("Enter A/B: ").toUpperCase();
                if(answer === "A"){
                    judgingOrPerceiving[outerLifeAnswerIndex] = answer;
                    outerLifeChosenAnswers[outerLifeIndex] = questionsDefualt[questionsDefualtIndex];
                    questionsDefualtIndex += 2;
                    outerLifeAnswerIndex++;
                    questionIndex++;
                    outerLifeIndex++;
                }
                else if (answer === "B"){
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
                    console.log("Expected A or B as Response");
                }
             }
             
            }
            
            console.log();
            console.log();
            for (let count = 0; count < energyChosenAnswers.length; count++){
                console.log(energyChosenAnswers[count]);
            }
            let optionACount = 0;
            let optionBCount = 0;
            for(let index = 0; index < extrovertOrIntrovert.length; index++){
                if(extrovertOrIntrovert[index] === "A"){
                    optionACount++;
                }
                else if(extrovertOrIntrovert[index] === "B"){
                    optionBCount++;
                }
            }
            console.log("Number Of A selected: " + optionACount);
            console.log("Number Of B selected: " + optionBCount);
            console.log();
            for (let count = 0; count < informationChosenAnswers.length; count++){
                console.log(informationChosenAnswers[count]);
            }
            let optionACountInfo = 0;
            let optionBCountInfo = 0;
            for(let index = 0; index < sensingOrIntuition.length; index++){
                if(sensingOrIntuition[index] === "A"){
                    optionACountInfo++;
                }
                else if(sensingOrIntuition[index] === "B"){
                    optionBCountInfo++;
                }
            }
            console.log("Number Of A selected: " + optionACountInfo);
            console.log("Number Of B selected: " + optionBCountInfo);
            console.log();
            for (let count = 0; count < decisionChosenAnswers.length; count++){
                console.log(decisionChosenAnswers[count]);
            }
            let optionACountDecision = 0;
            let optionBCountDecision = 0;
            for(let index = 0; index < thinkingOrFeeling.length; index++){
                if(thinkingOrFeeling[index] === "A"){
                    optionACountDecision++;
                }
                else if(thinkingOrFeeling[index] === "B"){
                    optionBCountDecision++;
                }
            }
            console.log("Number Of A selected: " + optionACountDecision);
            console.log("Number Of B selected: " + optionBCountDecision);
            console.log();
            for (let count = 0; count < outerLifeChosenAnswers.length; count++){
                console.log(outerLifeChosenAnswers[count]);
            }
            let optionACountOuterLife = 0;
            let optionBCountOuterLife = 0;
            for(let index = 0; index < judgingOrPerceiving.length; index++){
                if(judgingOrPerceiving[index] === "A"){
                    optionACountOuterLife++;
                }
                else if(judgingOrPerceiving[index] === "B"){
                    optionBCountOuterLife++;
                }
            }
            console.log("Number Of A selected: " + optionACountOuterLife);
            console.log("Number Of B selected: " + optionBCountOuterLife);
            console.log();
            let energyLetter = ''
            if(optionACount >= optionBCount)energyLetter = 'E';
            else energyLetter = 'I';
                        
            let informationLetter = ''
            if(optionACountInfo >= optionBCountInfo)informationLetter = 'S';
            else informationLetter = 'N';            
            
            let decisionLetter = ''
            if(optionACountDecision >= optionBCountDecision)decisionLetter = 'T';
            else decisionLetter = 'F';
                        
            let outerLifeLetter = ''
            if(optionACountOuterLife >= optionBCountOuterLife)outerLifeLetter = 'J';
            else  outerLifeLetter = 'P';
            
            
            let personalityType = "" + energyLetter + informationLetter + decisionLetter + outerLifeLetter;
        
            console.log(name + ", your Myers-Briggs personality type is: " + personalityType);
        

    

 
