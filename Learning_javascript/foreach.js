let object = {
    "name": "Har",
    "office": "Raj",
    "charger": "Oneplus"
}
for (const key in object) {

    const element = object[key];
    console.log(element, key);
}