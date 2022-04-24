const form = document.querySelector("form");
  cidField = form.querySelector(".customerID");
  cidInput = cidField.querySelector("input");
    nField = form.querySelector(".name");
    nInput = nField.querySelector("input");
   fnField = form.querySelector(".father-name");
   fnInput = fnField.querySelector("input");
  dobField = form.querySelector(".dob");
  dobInput = dobField.querySelector("input");
    gField = form.querySelector(".gender");
    gInput = gField.querySelector("input");
  perField = form.querySelector(".perm-address");
  perInput = perField.querySelector("input");
  preField = form.querySelector(".pres-address");
  preInput = preField.querySelector("input");
  panField = form.querySelector(".pan");
  panInput = panField.querySelector("input");
    mField = form.querySelector(".mobile-no");
    mInput = mField.querySelector("input");
    lField = form.querySelector(".landline-no");
    lInput = lField.querySelector("input");
   atField = form.querySelector(".account-type");
   atInput = atField.querySelector("input");
    bField = form.querySelector(".balance");
    bInput = bField.querySelector("input");
   anField = form.querySelector(".account-number");
   anInput = anField.querySelector("input");
   cnField = form.querySelector(".card-number");
   cnInput = cnField.querySelector("input");
    pField = form.querySelector(".password");
    pInput = pField.querySelector("input");

const pass = /^(?=.*\d)(?=.*[!@#$%^&*])(?=.*[a-z])(?=.*[A-Z]).{8,}$/;
const phone = /^\d{10}$/;
const landline = /\d{5}([- ]*)\d{6}/;
const pan = /[A-Z]{5}\d{4}[A-Z]$/;

form.onsubmit = (e) => {
    e.preventDefault();

    function checkCustomerID() {
        if(cidInput.value === ""){
            cidField.classList.add("error");
            cidField.classList.remove("valid");
        }else{
            cidField.classList.remove("error");
            cidField.classList.add("valid");
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
    function checkFatherName() {
        if(fnInput.value === ""){
            fnField.classList.add("error");
            fnField.classList.remove("valid");
        }else{
            fnField.classList.remove("error");
            fnField.classList.add("valid");
        }
    }
    function checkDOB() {
        if(dobInput.value === ""){
            dobField.classList.add("error");
            dobField.classList.remove("valid");
        }else{
            dobField.classList.remove("error");
            dobField.classList.add("valid");
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
    function checkPermanentAddress() {
        if(perInput.value === ""){
            perField.classList.add("error");
            perField.classList.remove("valid");
        }else{
            perField.classList.remove("error");
            perField.classList.add("valid");
        }
    }
    function checkPresentAddress() {
        if(preInput.value === ""){
            preField.classList.add("error");
            preField.classList.remove("valid");
        }else{
            preField.classList.remove("error");
            preField.classList.add("valid");
        }
    }
    function checkPAN() {
        if(panInput.value === "" || !panInput.value.match(pan)){
            panField.classList.add("error");
            panField.classList.remove("valid");
        }else{
            panField.classList.remove("error");
            panField.classList.add("valid");
        }
    }
    function checkMobileNo() {
        if(mInput.value === "" || !mInput.value.match(phone)){
            mField.classList.add("error");
            mField.classList.remove("valid");
        }else{
            mField.classList.remove("error");
            mField.classList.add("valid");
        }
    }
    function checkLandlineNo() {
        if(lInput.value === "" || !lInput.value.match(landline)){
            lField.classList.add("error");
            lField.classList.remove("valid");
        }else{
            lField.classList.remove("error");
            lField.classList.add("valid");
        }
    }
    function checkAccountType() {
        if(atInput.value === ""){
            atField.classList.add("error");
            atField.classList.remove("valid");
        }else{
            atField.classList.remove("error");
            atField.classList.add("valid");
        }
    }
    function checkBalanceNo() {
        if(bInput.value === "" || bInput.value === "0"){
            bField.classList.add("error");
            bField.classList.remove("valid");
        }else{
            bField.classList.remove("error");
            bField.classList.add("valid");
        }
    }
    function checkAccountNo() {
        if(anInput.value === ""){
            anField.classList.add("error");
            anField.classList.remove("valid");
        }else{
            anField.classList.remove("error");
            anField.classList.add("valid");
        }
    }
    function checkCardNo() {
        if(cnInput.value === ""){
            cnField.classList.add("error");
            cnField.classList.remove("valid");
        }else{
            cnField.classList.remove("error");
            cnField.classList.add("valid");
        }
    }
    function checkPassword() {
        if(pInput.value === "" || pInput.value.match(pass)){
            pField.classList.add("error");
            pField.classList.remove("valid");
        }else{
            pField.classList.remove("error");
            pField.classList.add("valid");
        }
    }
    (cidInput.value==="") ? cidField.classList.add("shake","error") : checkCustomerID();
    (nInput.value==="") ? nField.classList.add("shake","error") : checkName();
    (fnInput.value==="") ? fnField.classList.add("shake","error") : checkFatherName();
    (dobInput.value==="") ? dobField.classList.add("shake","error") : checkDOB();
    (gInput.value==="") ? gField.classList.add("shake","error") : checkGender();
    (perInput.value==="") ? perField.classList.add("shake","error") : checkPermanentAddress();
    (preInput.value==="") ? preField.classList.add("shake","error") : checkPresentAddress();
    (panInput.value==="" || !panInput.value.match(pan)) ? panField.classList.add("shake","error") : checkPAN();
    (mInput.value==="" || !mInput.value.match(phone)) ? mField.classList.add("shake","error") : checkMobileNo();
    (lInput.value==="" || !lInput.value.match(landline)) ? lField.classList.add("shake","error") : checkLandlineNo();
    (atInput.value==="") ? atField.classList.add("shake","error") : checkAccountType();
    (bInput.value==="" || bInput.value==="0") ? bField.classList.add("shake","error") : checkBalanceNo();
    (anInput.value==="") ? anField.classList.add("shake","error") : checkAccountNo();
    (cnInput.value==="") ? cnField.classList.add("shake","error") : checkCardNo();
    (pInput.value==="" || !pInput.value.match(pass)) ? pField.classList.add("shake","error") : checkPassword();

    setTimeout(()=>{ //remove shake class after 500ms
        cidField.classList.remove("shake");
        nField.classList.remove("shake");
        fnField.classList.remove("shake");
        dobField.classList.remove("shake");
        gField.classList.remove("shake");
        perField.classList.remove("shake");
        preField.classList.remove("shake");
        panField.classList.remove("shake");
        mField.classList.remove("shake");
        lField.classList.remove("shake");
        atField.classList.remove("shake");
        bField.classList.remove("shake");
        anField.classList.remove("shake");
        cnField.classList.remove("shake");
        pField.classList.remove("shake");
    }, 500);

    cidInput.onkeyup = ()=>{checkCustomerID();}
    nInput.onkeyup = ()=>{checkName();}
    fnInput.onkeyup = ()=>{checkFatherName();}
    dobInput.onkeyup = ()=>{checkDOB();}
    gInput.onkeyup = ()=>{checkGender();}
    perInput.onkeyup = ()=>{checkPermanentAddress();}
    preInput.onkeyup = ()=>{checkPresentAddress();}
    panInput.onkeyup = ()=>{checkPAN();}
    mInput.onkeyup = ()=>{checkMobileNo();}
    lInput.onkeyup = ()=>{checkLandlineNo();}
    atInput.onkeyup = ()=>{checkAccountType();}
    bInput.onkeyup = ()=>{checkBalanceNo();}
    anInput.onkeyup = ()=>{checkAccountNo();}
    cnInput.onkeyup = ()=>{checkCardNo();}
    pInput.onkeyup = ()=>{checkPassword();}

    if(!cidField.classList.contains("error") && !nField.classList.contains("error")
        && !fnField.classList.contains("error") && !dobField.classList.contains("error")
        && !gField.classList.contains("error") && !perField.classList.contains("error")
        && !preField.classList.contains("error") && !panField.classList.contains("error")
        && !mField.classList.contains("error") && !lField.classList.contains("error")
        && !atField.classList.contains("error") && !bField.classList.contains("error")
        && !anField.classList.contains("error") && !cnField.classList.contains("error")
        && !pField.classList.contains("error")){
        window.location.href = form.getAttribute("action"); //redirecting user to the specified url which is inside action attribute of form tag
    }

}