const form = document.querySelector("form");
    eField = form.querySelector(".userID");
    eInput = eField.querySelector("input");
    pField = form.querySelector(".password");
    pInput = pField.querySelector("input");



form.onsubmit = (e)=>{
    e.preventDefault(); //preventing from form submitting
    //if email and password is blank then add shake class in it else call specified function
    (eInput.value === "") ? eField.classList.add("shake", "error") : checkUserID();
    (pInput.value === "") ? pField.classList.add("shake", "error") : checkPass();

    setTimeout(()=>{ //remove shake class after 500ms
        eField.classList.remove("shake");
        pField.classList.remove("shake");
    }, 500);

    eInput.onkeyup = ()=>{checkUserID();} //calling checkUserID function on userid input keyup
    pInput.onkeyup = ()=>{checkPass();} //calling checkPassword function on pass input keyup

    function checkUserID(){ //checkPass function
        if(eInput.value === ""){ //if userid is empty then add error and remove valid class
            eField.classList.add("error");
            eField.classList.remove("valid");
        }else{ //if userid is empty then remove error and add valid class
            eField.classList.remove("error");
            eField.classList.add("valid");
        }
    }


    function checkPass(){ //checkPass function
        if(pInput.value === ""){ //if pass is empty then add error and remove valid class
            pField.classList.add("error");
            pField.classList.remove("valid");
        }else{ //if pass is empty then remove error and add valid class
            pField.classList.remove("error");
            pField.classList.add("valid");
        }
    }

    //if eField and pField doesn't contain error class that mean user filled details properly
    if(!eField.classList.contains("error") && !pField.classList.contains("error")){
        window.location.href = form.getAttribute("action"); //redirecting user to the specified url which is inside action attribute of form tag
    }
}