var gulp = require("gulp");
var browserify = require("browserify");
var source = require("vinyl-source-stream");
var buffer = require("vinyl-buffer");
var babelify = require('babelify');
var path = require('path');
var clean = require('gulp-clean');
var uglify = require('gulp-uglify');

gulp.task("bundle", function () {
    return browserify({
        entries: "./src/main/webapp/assets/components/handler.js", //./src/main/webapp/assets/index.js
        debug: true,
        transform: [
            babelify.configure({
                presets: ['es2015'],
                plugins: ["transform-decorators-legacy", "transform-class-properties"]
            })
        ]
    }).bundle()
        .pipe(source("bundle.js"))
        .pipe(buffer())
        .pipe(uglify())
        .pipe(gulp.dest("./src/main/webapp/assets/dist"))
});

gulp.task('clean', function () {
    return gulp.src('src/src/main/webapp/assets/dist/*', {read: false})
        .pipe(clean());
});

gulp.task("build:default",["clean", "bundle"],function(){
   console.log("Gulp TASK completed."); 
});