var gulp = require('gulp'), 
	concat = require('gulp-concat'), 
	uglify = require('gulp-uglify'), 
	cleanCSS = require('gulp-clean-css');
    ts = require('gulp-typescript');

gulp.task('js', function(){
	return gulp.src('src/app/components/*.ts')
	.pipe(ts({
		noImplicitAny: true,
		outDir: '../ngspring-web/src/main/webapp/js/',
        out: 'app-ngspring.js' 
	}))
	.pipe(gulp.dest('../ngspring-web/src/main/webapp/js/'));
});

gulp.task('html', function(){
	  return gulp.src('src/app/*.html')
	  .pipe(gulp.dest('../ngspring-web/src/main/webapp/templates/'))
	});

gulp.task('css', function(){
	  return gulp.src('src/app/*.css')
	    .pipe(cleanCSS())
	    .pipe(gulp.dest('../ngspring-web/src/main/webapp/css/'))
	});

gulp.task('default', [ 'html', 'css', 'js']);