/*********************************************
 * HTML CONFIGURATION TASK
 *********************************************/

/*
 * Copy favicon.ico of assets and paste into folder build/
 */

(function(){
    'use strict';

    module.exports = function(gulp, plg, folder){
      gulp.task(
      'copydevelop:html',
      'Copia html de la carpeta de assets y lo copia en build',
      copydevelophtml
    );

    function copydevelophtml(){
      return gulp.src(plg.path.join(folder.src)+'/**/*.html')
        // .pipe(plg.debug())
              .pipe(gulp.dest(plg.path.join(folder.develop)));
      }
  }
})();
