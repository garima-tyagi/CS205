read -p "Enter any file name to count unique words" a;
sort <$a |tr " " "\n" | uniq| wc -w
