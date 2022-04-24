const form = document.querySelector("form");
  aidField = form.querySelector(".adminID");
  aidInput = aidField.querySelector("input");
    nField = form.querySelector(".name");
    nInput = nField.querySelector("input");
    mField = form.querySelector(".mobile-no");
    mInput = mField.querySelector("input");
    gField = form.querySelector(".gender");
    gInput = gField.querySelector("input");
    pField = form.querySelector(".password");
    pInput = pField.querySelector("input");
    const phone = /^\d{10}$/;
    const pass = /^(?=.*\d)(?=.*[!@#$%^&*])(?=.*[a-z])(?=.*[A-Z]).{8,}$/;
    form.onsubmit = (e) =>{
          e.preventDefault(); //preventing from form submitting
          (aidInput.value === "") ? aidField.classList.add("shake","error") : checkAdminID();
          (nInput.value === "") ? nField.classList.add("shake","error") : checkName();
          (mInput.value === "" || !mInput.value.match(phone)) ? mField.classList.add("shake","error") : checkMobile();
          (gInput.value === "") ? gField.classList.add("shake","error") : checkGender();
          (pInput.value === "" || !pInput.value.match(pass)) ? pField.classList.add("shake","error") : checkPassword();

          setTimeout(()=>{ //remove shake class after 500ms
                mField.classList.remove("shake");
                aidField.classList.remove("shake");
                gField.classList.remove("shake");
                nField.classList.remove("shake");
                pField.classList.remove("shake");
          }, 500);

          mInput.onkeyup = ()=>{checkMobile();}
          aidInput.onkeyup = ()=>{checkAdminID();}
          gInput.onkeyup = ()=>{checkGender();}
          nInput.onkeyup = ()=>{checkName();}
          pInput.onkeyup = ()=>{checkPassword();}

          function checkMobile() {
                if(mInput.value === "" || !mInput.value.match(phone)){
                      mField.classList.add("error");
                      mField.classList.remove("valid");
                }else{
                      mField.classList.remove("error");
                      mField.classList.add("valid");
                }
          }
          function checkAdminID() {
                if(aidInput.value === ""){
                      aidField.classList.add("error");
                      aidField.classList.remove("valid");
                }else{
                      aidField.classList.remove("error");
                      aidField.classList.add("valid");
                }
          }
          function checkGender() {
                if(gInput.value === ""){
                      gField.classList.add("error");
                      gField.classList.remove("valid");
                }else{
                      gField.classList.remove("error");
                      gField.classList.add("valid");
                }
          }
          function checkName() {
                if(nInput.value === ""){
                      nField.classList.add("error");
                      nField.classList.remove("valid");
                }else{
                      nField.classList.remove("error");
                      nField.classList.add("valid");
                }
          }
          function checkPassword() {
                if(pInput.value === "" || !pInput.value.match(pass)){
                      pField.classList.add("error");
                      pField.classList.remove("valid");
                }else{
                      pField.classList.remove("error");
                      pField.classList.add("valid");
                }
          }
          if(!aidField.classList.contains("error") && !nField.classList.contains("error")
              && !mField.classList.contains("error") && !gField.classList.contains("error") && !pField.classList.contains("error")){
                window.location.href = form.getAttribute("action"); //redirecting user to the specified url which is inside action attribute of form tag
          }
      }