/*********************************************
 * GULP's paths configuration
 *********************************************/

(function(){
    'use strict';
    module.exports	=	projectPath();

    function projectPath(){

    	var folder 	=	{
            src         : 	'src/',
            dist        : 	'dist/',
            normal      : 	'normal/',
            min         : 	'min/',
            css         :	  'css/',
            scss        :	  'scss/',
            templates   :	  'templates/',
            views       :	  'views/',
            js          :	  'js/',
            build       :	  'build/',
            gulp        :	  'gulp/',
            task        :	  'task/',
            comp        :	  'components/',
            dev         :	  'dev/',
            util        :	  'utilities/',
            assets      :   'assets/',
            fonts       :   'fonts/',
            libs        :   'libs/',
            html        :   'html/',
            w3c         :   'w3c/',
            typescript  :   'app/',
            develop     :   '../ngspring-web/src/main/webapp/'
        }
        return folder;
    }
})();
