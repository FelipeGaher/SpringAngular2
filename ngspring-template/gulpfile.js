var gulp = require('gulp'), 
	concat = require('gulp-concat'), 
	uglify = require('gulp-uglify'), 
	cleanCSS = require('gulp-clean-css');


/*********************************************
 * TASK DEVELOP JS
 **********************************************/
gulp.task('js', function(){
	gulp.src('karma.conf.js')
	.pipe(concat('funciones.js'))
	.pipe(uglify())
	.pipe(gulp.dest('../ngspring-web/src/main/webapp/js/'));
	});

gulp.task('html', function(){
	  return gulp.src('/src/app/*.html')
	  .pipe(gulp.dest('../ngspring-web/src/main/webapp/templates/'))
	});

gulp.task('css', function(){
	  return gulp.src('/src/app/*.css')
	    .pipe(cleanCSS())
	    .pipe(gulp.dest('../ngspring-web/src/main/webapp/css/'))
	});

gulp.task('default', [ 'html', 'css', 'js']);