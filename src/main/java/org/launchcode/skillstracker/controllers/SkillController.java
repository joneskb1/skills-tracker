package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillController {


    @GetMapping()
    public String skills() {
        return "<html>" +
                "<body>" + "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li> " + "</ol></body></html>";
    }


    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value="finalForm")
    public String finalForm(@RequestParam String lang1,
                             @RequestParam String lang2,
                             @RequestParam String lang3,
                             @RequestParam String name) {
        return "<html>" +
                "<body>" + "<h1>" + name + "</h1>" +
                "<h2>Here is your list!</h2>" +
                "<ol>" +
                "<li>" + lang1 +" </li>" +
                "<li>"+ lang2 +"</li>" +
                "<li>"+ lang3 +"</li> " + "</ol></body></html>";
    }





    @GetMapping("form")
    public String form() {
              return "<form action='finalForm' method='post'>" +
                "<p>Name</p> <input type='text' name='name'>" + "<p>my favorite language</p>" +"<select name='lang1'>" + "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" + "<option value='Python'>Python</option>" +"</select>" +
                      "<p>my second favorite language</p>" +"<select name='lang2'>" + "<option value='Java'>Java</option>" +
                      "<option value='JavaScript'>JavaScript</option>" + "<option value='Python'>Python</option>" +"</select>" +
                      "<p>my 3rd favorite language</p>" +"<select name='lang3'>" + "<option value='Java'>Java</option>" +
                      "<option value='JavaScript'>JavaScript</option>" + "<option value='Python'>Python</option>" +"</select>" +
                "<input type='submit' value='submit!'>" +
                "</form>" +
                "</body>" +
                "</html>";

    }




}
