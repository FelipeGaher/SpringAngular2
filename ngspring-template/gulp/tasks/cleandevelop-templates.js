/*********************************************
 * DIST CONFIGURATION TASK
 *********************************************/

(function(){

    'use strict';

    module.exports = function(gulp, plg, folder){

    gulp.task(
      'cleandevelop:templates',
      'Elminina los archivos *.html de la carpeta build, para evitar conservar los archivos que ya no sirven. ',
      cleanDevelopTemplates
    );


    function cleanDevelopTemplates(){
            return gulp.src(plg.path.join(folder.develop)+'*.html')
      .pipe(plg.clean({force: true}))
        };
    };
})();
